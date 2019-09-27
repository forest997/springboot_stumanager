package com.wuyou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyou.dao.ClazzMapper;
import com.wuyou.entity.Clazz;
import com.wuyou.service.IClazzService;
import org.springframework.stereotype.Service;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Service
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements IClazzService {
}
