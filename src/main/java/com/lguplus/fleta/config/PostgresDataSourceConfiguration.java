package com.lguplus.fleta.config;

import com.lguplus.fleta.domain.model.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackageClasses = {User.class})
@EnableJpaRepositories(basePackages = {"com.lguplus.fleta.adapters.repositoryimpl"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class PostgresDataSourceConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource masterDataSource() {
		return DataSourceBuilder.create().build();
	}

//	@Bean
//	@ConfigurationProperties(prefix="spring.second-datasource")
//	public DataSource secondaryDataSource() {
//		return DataSourceBuilder.create().build();
//	}
}
