package com.cm;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cm.g
 * @date 2020/9/16 13:22
 * @Description: 参考 https://www.cnblogs.com/aizen-sousuke/p/11756279.html
 * DruidDataSourceAutoConfigure会注入一个DataSourceWrapper，其会在原生的spring.datasource下找
 * url, username, password 等。动态数据源 URL 等配置是在 dynamic 下，因此需要排除，否则会报错。
 * 排除方式有两种，一种是上述配置文件排除，还有一种可以在项目启动类排除：
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.cm.mapper")
public class DynamicDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceApplication.class, args);
    }
}
