package org.lc.entity;

import lombok.Data;

@Data
public class Student extends Base {

    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;

}
