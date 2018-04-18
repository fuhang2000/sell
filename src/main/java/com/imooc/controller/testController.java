package com.imooc.controller;

import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/a/b")
public class testController {

    @RequestMapping("/c")
    public tbc  List(@RequestBody tbc tbc) throws Exception {
        System.out.println("________________________________");
        System.out.println("aaaaaaaaaaaaaaaaaa"+tbc.getAp().getApList().get(0));
return  tbc;
    }
}