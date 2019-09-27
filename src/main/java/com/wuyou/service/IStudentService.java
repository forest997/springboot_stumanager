package com.wuyou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyou.entity.Student;
import com.wuyou.vo.StudentClassVO;

import java.util.List;

/**
 * @author Forest
 * @Date 2019/9/25
 */
public interface IStudentService extends IService<Student> {
    List<StudentClassVO> getStudentList();
}
