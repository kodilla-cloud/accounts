//package com.kodilla.accounts.configuration;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@RefreshScope
//@Configuration
//@RequiredArgsConstructor
//public class DataSourceConfig {
//
//    private final DataSourceProperties dataSourceProperties;
//
//    @Bean
//    @Primary
//    @RefreshScope
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .url(dataSourceProperties.getUrl())
//                .username(dataSourceProperties.getUsername())
//                .password(dataSourceProperties.getPassword())
//                .driverClassName(dataSourceProperties.getDriverClassName())
//                .build();
//    }
//}
