package org.lc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Base {

    private Integer flag;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
