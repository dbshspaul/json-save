package com.sys.org.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sys.org.spring.entity.JSONModel;
import com.sys.org.spring.repository.JSONRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Debasish on 04-Feb-18 11:43 AM
 */

@Controller
public class AppController {
    static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Autowired
    JSONRepository jsonRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    List<JSONModel> getAll() {
        return jsonRepository.findAll();
    }

    @PostMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody()
    public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file) {
        byte[] bytes = new byte[(int) file.getSize()];
        String jsonString = "";
        try {
            bytes = file.getBytes();
            jsonString = new String(bytes);

            ObjectMapper mapper = new ObjectMapper();
            JSONModel jsonModel = mapper.readValue(jsonString, JSONModel.class);
            jsonRepository.save(jsonModel);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>("Data Inserted Successfully", HttpStatus.CREATED);
    }

    @PostMapping(value = "/all", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody()
    public ResponseEntity uploadAllFile(@RequestParam(value = "path") String path) {
        File folder = new File(path);
        if (folder.isFile()) {
            return new ResponseEntity("Invalid Directory", HttpStatus.NOT_FOUND);
        } else if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            ObjectMapper mapper = new ObjectMapper();
            List<JSONModel> jsonModels = new ArrayList<JSONModel>();
            for (File file : files) {
                FileInputStream inputStream = null;
                byte[] buff = new byte[0];
                try {
                    if (file.getName().endsWith(".json") || file.getName().endsWith(".JSON")) {
                        inputStream = new FileInputStream(file);
                        buff = new byte[inputStream.available()];
                        inputStream.read(buff);
                        String content = new String(buff);
                        jsonModels.add(mapper.readValue(content, JSONModel.class));
                    }
                } catch (IOException e) {
                    LOGGER.error(file.getAbsolutePath()+" Has metadata error. "+e.getMessage());
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (buff.length > 0) {
                        buff.clone();
                    }
                }
            }
            if (jsonModels.size() > 0) {
                jsonRepository.save(jsonModels);
                return new ResponseEntity(jsonModels.size() + " Entity created", HttpStatus.CREATED);
            } else {
                return new ResponseEntity("No JSON file found in folder", HttpStatus.CREATED);
            }
        } else {
            return new ResponseEntity(path + " is invalid path.", HttpStatus.NOT_FOUND);
        }
    }
}
