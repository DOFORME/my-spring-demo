package org.lc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Clazz extends Base {

    private Integer id;

    private Integer code;

    private String name;
}
