package com.example.gsyvideoplayer.model;

/**
 * Created by wangrui on 2017/6/9.
 */

public class LessonModel {

    private BizDataBean bizData;
    private String msg;
    private String rtnCode;
    private long ts;

    public static LessonModel objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, LessonModel.class);
    }

    public BizDataBean getBizData() {
        return bizData;
    }

    public void setBizData(BizDataBean bizData) {
        this.bizData = bizData;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }
}
