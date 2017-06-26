package com.example.gsyvideoplayer.model;

import java.util.List;

/**
 * Created by wangrui on 2017/6/9.
 */

public class BizDataBean {

    private ConditionsBean conditions;
    private int page;
    private int pagesize;
    private int records;
    private int total;
    private List<RowsBean> rows;

    public static BizDataBean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, BizDataBean.class);
    }

    public ConditionsBean getConditions() {
        return conditions;
    }

    public void setConditions(ConditionsBean conditions) {
        this.conditions = conditions;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }
}
