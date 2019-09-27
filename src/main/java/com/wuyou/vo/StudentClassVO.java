package com.wuyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Forest
 * @Date 2019/9/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClassVO {
    private Integer stuId;
    private Integer classId;
    private String stuName;
    private String className;
    private Integer stuAge;
    private String classMaster;
}
