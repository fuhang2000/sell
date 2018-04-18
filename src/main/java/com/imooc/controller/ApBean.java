package com.imooc.controller;

import lombok.Data;

@Data
public class ApBean {

    @Override
    public String toString() {
        return "ApBean{" +
                "bssid='" + bssid + '\'' +
                '}';
    }

    private String bssid;

}
