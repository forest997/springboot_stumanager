package com.wuyou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyou.dao.StudentMapper;
import com.wuyou.entity.Student;
import com.wuyou.service.IStudentService;
import com.wuyou.vo.StudentClassVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentClassVO> getStudentList() {
        return studentMapper.getStudentList();
    }
}
