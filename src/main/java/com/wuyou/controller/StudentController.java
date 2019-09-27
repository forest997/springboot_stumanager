package com.wuyou.controller;

import com.wuyou.entity.Clazz;
import com.wuyou.entity.Student;
import com.wuyou.service.IClazzService;
import com.wuyou.service.IStudentService;
import com.wuyou.vo.StudentClassVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Controller
@RequestMapping("/student/")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private IClazzService clazzService;
    @RequestMapping("stuList")
    public String showStuList(ModelMap map){
        List<StudentClassVO> stuList = studentService.getStudentList();
        map.put("stuList", stuList);
        return "stuList";
    }

    @RequestMapping("delStu/{id}")
    public String delStu(@PathVariable Integer id){
        studentService.removeById(id);
        return "redirect:/student/stuList";
    }

    @RequestMapping("toAddStudent")
    public String toAddStudent(ModelMap map){
        List<Clazz> clazzList = clazzService.list();
        map.put("clazzList", clazzList);
        return "addStu";

    }
    @RequestMapping("addStudent")
    public String addStudent(Student student){
       if(studentService.saveOrUpdate(student)){
           return "redirect:student/stuList";
       }else{
           return "redirect:student/stuList";
       }
    }

    @RequestMapping("toUpdateStudent/{id}")
    public String toUpdateStudent(@PathVariable Integer id,ModelMap map){
        Student student = studentService.getById(id);
        List<Clazz> clazzList = clazzService.list();
        map.put("clazzList", clazzList);
        map.put("student", student);

        return "updateStu";
    }

    @RequestMapping("updateStudent")
    public String updateStudent(Student student,ModelMap map){
        if(studentService.saveOrUpdate(student)){
        }

        return "redirect:/student/stuList";
    }
}
