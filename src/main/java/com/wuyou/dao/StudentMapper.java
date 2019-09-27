package com.wuyou.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuyou.entity.Student;
import com.wuyou.vo.StudentClassVO;

import java.util.List;

/**
 * @author Forest
 * @Date 2019/9/25
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<StudentClassVO> getStudentList();
}
