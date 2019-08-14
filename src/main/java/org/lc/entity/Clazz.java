package org.lc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Clazz extends Base {

    private Integer id;

    private Integer code;

    private String name;
}
