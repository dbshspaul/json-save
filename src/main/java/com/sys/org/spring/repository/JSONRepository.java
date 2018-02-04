package com.sys.org.spring.repository;

import com.sys.org.spring.entity.JSONModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Debasish on 04-Feb-18 9:18 PM
 */
public interface JSONRepository  extends MongoRepository<JSONModel, String> {
}
