/**
 * spring boot  问题记录
 */

public class StudyRecord {
    /**
     *
     * 主页本地访问地址
     * http://localhost:8080/index
     *
     *
     *  <!--maven仓库查找网站-->
     *         <!--http://maven.outofmemory.cn/javax.inject/javax.inject/1/-->
     *         <!--http://mvnrepository.com-->
     *
     *
     * 001 教程地址
     *  https://www.zhihu.com/question/53729800
     *
     * 002 404错误
     * @RestController 注释的类需要与@SpringBootApplication注释的类处于同意文件夹下
     * 或者在该类上添加注解@ComponentScan(basePackages = {"controller"}),java目录下的包名路径,\]
     * 不需要包含java文件夹路径,
     * 一 spring boot的启动类不能直接放在main(src.main.java)这个包下面，把它放在有包的里面就可以了。
     *  二 正常启动了，但是我写了一个controller ，用的@RestController 注解去配置的controller，然后路径也搭好了，
     *  但是浏览器一直报404.最后原因是，spring boot只会扫描启动类当前包和以下的包 。
     *  如果将 spring boot 放在 包  com.dai.controller 里面的话 ，它会扫描 com.dai.controller 和
     *  com.dai.controller.* 里面的所有的 ； 还有一种解决方案是 在启动类的上面添加
     *  @ComponentScan(basePackages = {"com.dai.*"})
     *
     *  003 springboot中访问静态资源界面 html,css等
     *  将静态页面文件放到src-->main-->resources-->static-->html文件夹下
     *  访问的路径即为http://localhost:8080/html/hello.html
     *
     *
     *  004  springboot中访问jsp页面
     *  首先在pom.xml中添加
     *          <!--添加访问jsp支持*************-->
     *         <dependency>
     *             <groupId>org.springframework.boot</groupId>
     *             <artifactId>spring-boot-starter-tomcat</artifactId>
     *             <scope>provided</scope>
     *         </dependency>
     *
     *         <!-- JSTL -->
     *         <dependency>
     *             <groupId>javax.servlet</groupId>
     *             <artifactId>jstl</artifactId>
     *         </dependency>
     *
     *         <!-- Need this to compile JSP -->
     *         <dependency>
     *             <groupId>org.apache.tomcat.embed</groupId>
     *             <artifactId>tomcat-embed-jasper</artifactId>
     *             <scope>provided</scope>
     *         </dependency>
     *
     *         <dependency>
     *             <groupId>org.eclipse.jdt.core.compiler</groupId>
     *             <artifactId>ecj</artifactId>
     *             <version>4.6.1</version>
     *             <scope>provided</scope>
     *         </dependency>
     *         <!--添加访问jsp支持*******************-->
     *
     *  创建目录webapp--WEB-INF--jsp
     *  在resources文件夹下的application.properties文件中添加
     *
     *  spring.mvc.view.prefix=/WEB-INF/jsp/
     *  spring.mvc.view.suffix=.jsp
     *
     * 005 springboot 访问数据库
     * 在pom.xml文件中添加
     *          <!--添加MySQL数据库驱动-->
     *         <dependency>
     *             <groupId>mysql</groupId>
     *             <artifactId>mysql-connector-java</artifactId>
     *             <version>8.0.11</version>
     *         </dependency>
     *         <dependency>
     *             <groupId>org.springframework.boot</groupId>
     *             <artifactId>spring-boot-starter-jdbc</artifactId>
     *         </dependency>
     *         <!--添加MySQL数据库驱动-->
     * 在resources文件夹下的application.properties文件中添加
     *
     * spring.datasource.url=jdbc:mysql://localhost:3306/test?serverTimezone=GMT
     * spring.datasource.username=root
     * spring.datasource.password=dingzhixin
     * spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
     *
     *  连接并访问数据库参见DataController.java文件
     *
     * 006 spring boot 整合mybatics  纯java
     * 在pom.xml文件中添加
     *          <!--集成mybatics-->
     *         <!-- https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter -->
     *         <dependency>
     *             <groupId>org.mybatis.spring.boot</groupId>
     *             <artifactId>mybatis-spring-boot-starter</artifactId>
     *             <version>1.3.2</version>
     *         </dependency>
     *
     *         <!--集成mybatics-->
     *  在resources文件夹下的application.properties文件中配置数据库链接
     *
     *  007 解决mybatics接口类@Mapper注入失败的问题
     *   在启动类SpringbootdemoApplication下添加@MapperScan("@Mapper所在的包名")注解
     *   http://www.cnblogs.com/zqr99/p/8677642.html
     *
     *
     *  008  解决@mapper接口类添加@autowired注解时提示
     *  Could not autowire. No beans of 'UserDao' type found
     *  在@Mapper接口类上添加注解@Component即可
     *
     *
     */
}
