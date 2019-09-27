package com.wuyou.controller;

import com.wuyou.entity.Clazz;
import com.wuyou.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Forest
 * @Date 2019/9/26
 */
@Controller
@RequestMapping("/clazz/")
public class ClazzController {
    @Autowired
    private IClazzService clazzService;


    @RequestMapping("getClazzList")
    public String getClazzList(ModelMap map){
        List<Clazz> clazzList = clazzService.list();
        map.put("clazzList", clazzList);
        System.out.println(2);
        System.out.println(1);
        return "clazzList";
    }

}
