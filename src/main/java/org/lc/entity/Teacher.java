package org.lc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Teacher extends Base {

    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;
}
