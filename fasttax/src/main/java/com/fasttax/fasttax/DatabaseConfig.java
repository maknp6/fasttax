package com.fasttax.fasttax;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableSpringDataWebSupport
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.fasttax.repository")
@ComponentScan(basePackages="com.fasttax")
public class DatabaseConfig {

@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,DataSource dataSource) {
return builder.dataSource(dataSource)
.packages("com.fasttax.entity")
.build();
}

@Bean(name="transactionManager")
public PlatformTransactionManager barTransactionManager(
EntityManagerFactory factory) {
return new JpaTransactionManager(factory);
}

}