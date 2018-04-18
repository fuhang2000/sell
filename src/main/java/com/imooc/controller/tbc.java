package com.imooc.controller;

import lombok.Data;
@Data
public class tbc {


    @Override
    public String toString() {
        return "tbc{" +
                "ap=" + ap +
                '}';
    }

    private ApList ap;
}
