package org.lc.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lc
 */
@Slf4j
public class BeanLifeCircle {

    private String name;

    public BeanLifeCircle() {
      log.info("BeanLifeCircle constructor");
    }

    public void init() {
        log.info("BeanLifeCircle init method");
    }

    public void destroy() {
        log.info("BeanLifeCircle destroy");
        log.info("BeanLifeCircle's name is {}", name);
    }

    public void setName(String name) {
        log.info("BeanLifeCircle property set method");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
