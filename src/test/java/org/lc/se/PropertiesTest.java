package org.lc.se;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

@Slf4j
public class PropertiesTest {

    /**
     * properties读取配置文件
     */
    @Test
    void read() {
        URL url = Thread.currentThread().getContextClassLoader().getResource("config.properties");
        String[] parts = String.valueOf(url).split(":/", 2);
        String path = parts[1];
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(path));
            properties.load(fileInputStream);
            log.info(properties.getProperty("redis.port"));
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getClassName() {
        log.info(String.class.getName());
    }
}
