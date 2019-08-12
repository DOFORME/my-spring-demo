package org.lc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Student extends Base {

    @NotNull
    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;

}
