package com.wuyou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("t_student")
public class Student implements Serializable {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Integer classId;
}
