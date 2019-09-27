package com.wuyou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_class")
public class Clazz implements Serializable {
    private Integer id;
    private String name;
    private String master;
}
