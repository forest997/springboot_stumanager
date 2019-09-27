package com.wuyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Forest
 * @Date 2019/9/27
 */
@Controller
@RequestMapping("/grade")
public class GradeController {
    @RequestMapping("getList")
    public String getList(){
        return null;
    }
}
