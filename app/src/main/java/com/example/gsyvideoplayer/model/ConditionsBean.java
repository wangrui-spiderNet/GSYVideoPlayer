package com.example.gsyvideoplayer.model;

/**
 * Created by wangrui on 2017/6/9.
 */

class ConditionsBean {
    /**
     * courseTypeId : 0
     */

    private String courseTypeId;

    public static ConditionsBean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, ConditionsBean.class);
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }
}
