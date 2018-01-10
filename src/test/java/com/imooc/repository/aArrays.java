package com.imooc.repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 */
public class aArrays {


    public static void main(String[] args) {

/*
     List<Integer> list=   Arrays.asList(2,9);

        System.out.println("listtoString:"+list.toString());
        System.out.println("listsize():"+list.size());
        list.add(4);
        System.out.println("------------list add------------");
        System.out.println("listtoString:"+list.toString());
        System.out.println("listsize():"+list.size());*/

int [] ints= {1,2,3,4};
        List list=   Arrays.asList(ints);
        System.out.println("listtoString:"+list.toString());
        System.out.println("listsize():"+list.size());
    }
}
