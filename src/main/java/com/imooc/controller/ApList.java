package com.imooc.controller;

import java.util.List;

public class ApList {
    @Override
    public String toString() {
        return "ApList{" +
                "apList=" + apList +
                '}';
    }

    private List<ApBean> apList;

    public List<ApBean> getApList() {
        return apList;
    }

    public void setApList(List<ApBean> apList) {
        this.apList = apList;
    }
}