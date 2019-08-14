package org.lc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Teacher extends Base {

    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;
}
