package com.example.gsyvideoplayer.model;

import java.util.List;

/**
 * Created by wangrui on 2017/6/9.
 */

public class RowsBean {
    /**
     * collect : false
     * courseDocList : []
     * courseName : 《幼儿八项重要动作经验》
     * courseTimes : 2
     * courseTypeId : 29
     * courseTypeName : 健康课程
     * cover : http://zl-teacher.oss-cn-hangzhou.aliyuncs.com/doc/cover/G041.jpg
     * createDate : 1486970915435
     * createDateAsDate : 1486970915435
     * duration : 3568
     * finish : false
     * grade : 不限
     * id : 435
     * keywords : 黄永宽,健康,讲座,体育,运动,动作经验,台湾教授,幼儿八项重要动作经验
     * lastLearnTime : 0
     * lastModDate : 1496978741050
     * lastModDateAsDate : 1496978741050
     * lecture : 黄永宽
     * lectureId : 149
     * plans : []
     * repeat : false
     * sourceHd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/176bcb60897b4474b20cfff46dcbff99/act-ss-m3u8-hd/G041.m3u8
     * sourceLd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/176bcb60897b4474b20cfff46dcbff99/act-ss-m3u8-ld/G041.m3u8
     * sourceSd : http://zl-teacher-output.oss-cn-hangzhou.aliyuncs.com/176bcb60897b4474b20cfff46dcbff99/act-ss-m3u8-sd/G041.m3u8
     * totalLearnTime : 0
     * videoSourceId : 315
     * viewCounts : 227
     * viewers : 40
     * creatorName : 18300000000
     */

    private boolean collect;
    private String courseName;
    private int courseTimes;
    private int courseTypeId;
    private String courseTypeName;
    private String cover;
    private long createDate;
    private long createDateAsDate;
    private int duration;
    private boolean finish;
    private String grade;
    private int id;
    private String keywords;
    private int lastLearnTime;
    private long lastModDate;
    private long lastModDateAsDate;
    private String lecture;
    private int lectureId;
    private boolean repeat;
    private String sourceHd;
    private String sourceLd;
    private String sourceSd;
    private int totalLearnTime;
    private int videoSourceId;
    private int viewCounts;
    private int viewers;
    private String creatorName;


    public static RowsBean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, RowsBean.class);
    }

    public boolean isCollect() {
        return collect;
    }

    public void setCollect(boolean collect) {
        this.collect = collect;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTimes() {
        return courseTimes;
    }

    public void setCourseTimes(int courseTimes) {
        this.courseTimes = courseTimes;
    }

    public int getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(int courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getCreateDateAsDate() {
        return createDateAsDate;
    }

    public void setCreateDateAsDate(long createDateAsDate) {
        this.createDateAsDate = createDateAsDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getLastLearnTime() {
        return lastLearnTime;
    }

    public void setLastLearnTime(int lastLearnTime) {
        this.lastLearnTime = lastLearnTime;
    }

    public long getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(long lastModDate) {
        this.lastModDate = lastModDate;
    }

    public long getLastModDateAsDate() {
        return lastModDateAsDate;
    }

    public void setLastModDateAsDate(long lastModDateAsDate) {
        this.lastModDateAsDate = lastModDateAsDate;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public String getSourceHd() {
        return sourceHd;
    }

    public void setSourceHd(String sourceHd) {
        this.sourceHd = sourceHd;
    }

    public String getSourceLd() {
        return sourceLd;
    }

    public void setSourceLd(String sourceLd) {
        this.sourceLd = sourceLd;
    }

    public String getSourceSd() {
        return sourceSd;
    }

    public void setSourceSd(String sourceSd) {
        this.sourceSd = sourceSd;
    }

    public int getTotalLearnTime() {
        return totalLearnTime;
    }

    public void setTotalLearnTime(int totalLearnTime) {
        this.totalLearnTime = totalLearnTime;
    }

    public int getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(int videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    public int getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }


}
