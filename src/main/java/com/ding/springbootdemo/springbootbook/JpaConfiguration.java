package com.ding.springbootdemo.springbootbook;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.ding.springbootdemo.springbootbook")
@EntityScan(basePackages = "com.ding.springbootdemo.springbootbook.entity")
public class JpaConfiguration {
    @Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }


    /**
     * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException:
     * No qualifying bean of type 'com.ding.springbootdemo.springbootbook.UserRepository'
     * available: expected at least 1 bean which qualifies as autowire candidate.
     * Dependency annotations:
     * {@org.springframework.beans.factory.annotation.Autowired(required=true)}
     */
}
/**
 * @EnableAutoConfiguration
 * @EntityScan(basePackages = { "com.wt.rds" })
 *
 * @Order(Ordered.HIGHEST_PRECEDENCE)
 * @Configuration
 * @EnableTransactionManagement(proxyTargetClass = true)
 * @EnableJpaRepositories(basePackages = "dbdemo.mysql.repository")
 * @EntityScan(basePackages = "dbdemo.**.entity")
 * public class JpaConfiguration {
 *     @Bean
 *     PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
 *         return new PersistenceExceptionTranslationPostProcessor();
 *     }
 * }
 *
 *
 * @Bean
 *     public DataSource dataSource() {
 *         DriverManagerDataSource dataSource = new DriverManagerDataSource();
 *         dataSource.setDriverClassName("com.mysql.jdbc.Driver");
 *         dataSource.setUrl("jdbc:mysql://localhost:3306/springboot?characterEncoding=utf8");
 *         dataSource.setUsername("root");
 *         dataSource.setPassword("root");
 *
 *         return dataSource;
 *     }
 *
 *     @Bean
 *     public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
 *         LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
 *         entityManagerFactoryBean.setDataSource(dataSource());
 *         entityManagerFactoryBean.setPackagesToScan("dbdemo.mysql.entity");
 *         entityManagerFactoryBean.setJpaProperties(buildHibernateProperties());
 *         entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter() {{
 *             setDatabase(Database.MYSQL);
 *         }});
 *         return entityManagerFactoryBean;
 *     }
 *
 *     protected Properties buildHibernateProperties()
 *     {
 *         Properties hibernateProperties = new Properties();
 *
 *         hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
 *         hibernateProperties.setProperty("hibernate.show_sql", "true");
 *         hibernateProperties.setProperty("hibernate.use_sql_comments", "false");
 *         hibernateProperties.setProperty("hibernate.format_sql", "true");
 *         hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
 *         hibernateProperties.setProperty("hibernate.generate_statistics", "false");
 *         hibernateProperties.setProperty("javax.persistence.validation.mode", "none");
 *
 *         //Audit History flags
 *         hibernateProperties.setProperty("org.hibernate.envers.store_data_at_delete", "true");
 *         hibernateProperties.setProperty("org.hibernate.envers.global_with_modified_flag", "true");
 *
 *         return hibernateProperties;
 *     }
 *
 *     @Bean
 *     public PlatformTransactionManager transactionManager() {
 *         return new JpaTransactionManager();
 *     }
 *
 *     @Bean
 *     public TransactionTemplate transactionTemplate() {
 *         return new TransactionTemplate(transactionManager());
 *     }
 *
 *
 *  https://www.concretepage.com/questions/555
 *     @Configuration
 * @EnableJpaRepositories("com.myproject.repository")
 * @EnableTransactionManagement
 * @PropertySource("classpath:database.properties")
 * public class DBConfig {
 * 	@Autowired
 *         private Environment env;
 *         @Bean
 * 	public DataSource getDataSource() {
 * 	    BasicDataSource dataSource = new BasicDataSource();
 * 	    dataSource.setDriverClassName(env.getProperty("database.driverClassName"));
 * 	    dataSource.setUrl(env.getProperty("database.url"));
 * 	    dataSource.setUsername(env.getProperty("database.username"));
 * 	    dataSource.setPassword(env.getProperty("database.password"));
 * 	    return dataSource;
 * 	}
 * 	@Bean
 * 	public JdbcTemplate jdbcTemplate() {
 * 	    return new JdbcTemplate(getDataSource());
 * 	}
 * }
 */
