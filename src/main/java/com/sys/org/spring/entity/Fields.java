
package com.sys.org.spring.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "issuetype",
    "timespent",
    "project",
    "fixVersions",
    "aggregatetimespent",
    "resolution",
    "customfield_10500",
    "customfield_10702",
    "customfield_10901",
    "resolutiondate",
    "workratio",
    "lastViewed",
    "watches",
    "created",
    "priority",
    "customfield_10100",
    "customfield_10300",
    "labels",
    "customfield_10301",
    "timeestimate",
    "aggregatetimeoriginalestimate",
    "versions",
    "issuelinks",
    "assignee",
    "updated",
    "status",
    "components",
    "timeoriginalestimate",
    "description",
    "timetracking",
    "customfield_10006",
    "customfield_10600",
    "customfield_10007",
    "customfield_10601",
    "customfield_10602",
    "customfield_10008",
    "attachment",
    "customfield_10009",
    "aggregatetimeestimate",
    "summary",
    "creator",
    "subtasks",
    "reporter",
    "customfield_10000",
    "aggregateprogress",
    "customfield_10001",
    "customfield_10002",
    "customfield_10200",
    "environment",
    "duedate",
    "progress",
    "comment",
    "votes",
    "worklog"
})
public class Fields {

    @JsonProperty("issuetype")
    private Issuetype issuetype;
    @JsonProperty("timespent")
    private Object timespent;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("fixVersions")
    private List<Object> fixVersions = null;
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("resolution")
    private Resolution resolution;
    @JsonProperty("customfield_10500")
    private Object customfield10500;
    @JsonProperty("customfield_10702")
    private Object customfield10702;
    @JsonProperty("customfield_10901")
    private Object customfield10901;
    @JsonProperty("resolutiondate")
    private String resolutiondate;
    @JsonProperty("workratio")
    private Integer workratio;
    @JsonProperty("lastViewed")
    private Object lastViewed;
    @JsonProperty("watches")
    private Watches watches;
    @JsonProperty("created")
    private String created;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("customfield_10100")
    private Object customfield10100;
    @JsonProperty("customfield_10300")
    private Object customfield10300;
    @JsonProperty("labels")
    private List<Object> labels = null;
    @JsonProperty("customfield_10301")
    private Object customfield10301;
    @JsonProperty("timeestimate")
    private Object timeestimate;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Object aggregatetimeoriginalestimate;
    @JsonProperty("versions")
    private List<Object> versions = null;
    @JsonProperty("issuelinks")
    private List<Object> issuelinks = null;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("components")
    private List<Object> components = null;
    @JsonProperty("timeoriginalestimate")
    private Object timeoriginalestimate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("timetracking")
    private Timetracking timetracking;
    @JsonProperty("customfield_10006")
    private Object customfield10006;
    @JsonProperty("customfield_10600")
    private Object customfield10600;
    @JsonProperty("customfield_10007")
    private Object customfield10007;
    @JsonProperty("customfield_10601")
    private Object customfield10601;
    @JsonProperty("customfield_10602")
    private Object customfield10602;
    @JsonProperty("customfield_10008")
    private Object customfield10008;
    @JsonProperty("attachment")
    private List<Object> attachment = null;
    @JsonProperty("customfield_10009")
    private Object customfield10009;
    @JsonProperty("aggregatetimeestimate")
    private Object aggregatetimeestimate;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("subtasks")
    private List<Object> subtasks = null;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("customfield_10000")
    private Object customfield10000;
    @JsonProperty("aggregateprogress")
    private Aggregateprogress aggregateprogress;
    @JsonProperty("customfield_10001")
    private Object customfield10001;
    @JsonProperty("customfield_10002")
    private String customfield10002;
    @JsonProperty("customfield_10200")
    private Object customfield10200;
    @JsonProperty("environment")
    private Object environment;
    @JsonProperty("duedate")
    private Object duedate;
    @JsonProperty("progress")
    private Progress progress;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("votes")
    private Votes votes;
    @JsonProperty("worklog")
    private Worklog worklog;

    @JsonProperty("issuetype")
    public Issuetype getIssuetype() {
        return issuetype;
    }

    @JsonProperty("issuetype")
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @JsonProperty("timespent")
    public Object getTimespent() {
        return timespent;
    }

    @JsonProperty("timespent")
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("fixVersions")
    public List<Object> getFixVersions() {
        return fixVersions;
    }

    @JsonProperty("fixVersions")
    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }

    @JsonProperty("aggregatetimespent")
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    @JsonProperty("aggregatetimespent")
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    @JsonProperty("resolution")
    public Resolution getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @JsonProperty("customfield_10500")
    public Object getCustomfield10500() {
        return customfield10500;
    }

    @JsonProperty("customfield_10500")
    public void setCustomfield10500(Object customfield10500) {
        this.customfield10500 = customfield10500;
    }

    @JsonProperty("customfield_10702")
    public Object getCustomfield10702() {
        return customfield10702;
    }

    @JsonProperty("customfield_10702")
    public void setCustomfield10702(Object customfield10702) {
        this.customfield10702 = customfield10702;
    }

    @JsonProperty("customfield_10901")
    public Object getCustomfield10901() {
        return customfield10901;
    }

    @JsonProperty("customfield_10901")
    public void setCustomfield10901(Object customfield10901) {
        this.customfield10901 = customfield10901;
    }

    @JsonProperty("resolutiondate")
    public String getResolutiondate() {
        return resolutiondate;
    }

    @JsonProperty("resolutiondate")
    public void setResolutiondate(String resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    @JsonProperty("workratio")
    public Integer getWorkratio() {
        return workratio;
    }

    @JsonProperty("workratio")
    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    @JsonProperty("lastViewed")
    public Object getLastViewed() {
        return lastViewed;
    }

    @JsonProperty("lastViewed")
    public void setLastViewed(Object lastViewed) {
        this.lastViewed = lastViewed;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("customfield_10100")
    public Object getCustomfield10100() {
        return customfield10100;
    }

    @JsonProperty("customfield_10100")
    public void setCustomfield10100(Object customfield10100) {
        this.customfield10100 = customfield10100;
    }

    @JsonProperty("customfield_10300")
    public Object getCustomfield10300() {
        return customfield10300;
    }

    @JsonProperty("customfield_10300")
    public void setCustomfield10300(Object customfield10300) {
        this.customfield10300 = customfield10300;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("customfield_10301")
    public Object getCustomfield10301() {
        return customfield10301;
    }

    @JsonProperty("customfield_10301")
    public void setCustomfield10301(Object customfield10301) {
        this.customfield10301 = customfield10301;
    }

    @JsonProperty("timeestimate")
    public Object getTimeestimate() {
        return timeestimate;
    }

    @JsonProperty("timeestimate")
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    @JsonProperty("issuelinks")
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    @JsonProperty("timeoriginalestimate")
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    @JsonProperty("timeoriginalestimate")
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("timetracking")
    public Timetracking getTimetracking() {
        return timetracking;
    }

    @JsonProperty("timetracking")
    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
    }

    @JsonProperty("customfield_10006")
    public Object getCustomfield10006() {
        return customfield10006;
    }

    @JsonProperty("customfield_10006")
    public void setCustomfield10006(Object customfield10006) {
        this.customfield10006 = customfield10006;
    }

    @JsonProperty("customfield_10600")
    public Object getCustomfield10600() {
        return customfield10600;
    }

    @JsonProperty("customfield_10600")
    public void setCustomfield10600(Object customfield10600) {
        this.customfield10600 = customfield10600;
    }

    @JsonProperty("customfield_10007")
    public Object getCustomfield10007() {
        return customfield10007;
    }

    @JsonProperty("customfield_10007")
    public void setCustomfield10007(Object customfield10007) {
        this.customfield10007 = customfield10007;
    }

    @JsonProperty("customfield_10601")
    public Object getCustomfield10601() {
        return customfield10601;
    }

    @JsonProperty("customfield_10601")
    public void setCustomfield10601(Object customfield10601) {
        this.customfield10601 = customfield10601;
    }

    @JsonProperty("customfield_10602")
    public Object getCustomfield10602() {
        return customfield10602;
    }

    @JsonProperty("customfield_10602")
    public void setCustomfield10602(Object customfield10602) {
        this.customfield10602 = customfield10602;
    }

    @JsonProperty("customfield_10008")
    public Object getCustomfield10008() {
        return customfield10008;
    }

    @JsonProperty("customfield_10008")
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    @JsonProperty("attachment")
    public List<Object> getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(List<Object> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("customfield_10009")
    public Object getCustomfield10009() {
        return customfield10009;
    }

    @JsonProperty("customfield_10009")
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    @JsonProperty("aggregatetimeestimate")
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    @JsonProperty("aggregatetimeestimate")
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("subtasks")
    public List<Object> getSubtasks() {
        return subtasks;
    }

    @JsonProperty("subtasks")
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @JsonProperty("customfield_10000")
    public Object getCustomfield10000() {
        return customfield10000;
    }

    @JsonProperty("customfield_10000")
    public void setCustomfield10000(Object customfield10000) {
        this.customfield10000 = customfield10000;
    }

    @JsonProperty("aggregateprogress")
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    @JsonProperty("aggregateprogress")
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    @JsonProperty("customfield_10001")
    public Object getCustomfield10001() {
        return customfield10001;
    }

    @JsonProperty("customfield_10001")
    public void setCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
    }

    @JsonProperty("customfield_10002")
    public String getCustomfield10002() {
        return customfield10002;
    }

    @JsonProperty("customfield_10002")
    public void setCustomfield10002(String customfield10002) {
        this.customfield10002 = customfield10002;
    }

    @JsonProperty("customfield_10200")
    public Object getCustomfield10200() {
        return customfield10200;
    }

    @JsonProperty("customfield_10200")
    public void setCustomfield10200(Object customfield10200) {
        this.customfield10200 = customfield10200;
    }

    @JsonProperty("environment")
    public Object getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    @JsonProperty("duedate")
    public Object getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    @JsonProperty("worklog")
    public Worklog getWorklog() {
        return worklog;
    }

    @JsonProperty("worklog")
    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

}
