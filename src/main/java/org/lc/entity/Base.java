package org.lc.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Base implements Serializable {

    private static final long serialVersionUID = -2470272882173220689L;

    private Integer flag;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
