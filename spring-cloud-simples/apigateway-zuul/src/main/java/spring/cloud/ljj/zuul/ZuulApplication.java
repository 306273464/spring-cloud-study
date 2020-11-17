package spring.cloud.ljj.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@SpringBootApplication
@EnableZuulProxy // 启用 zuul 自带熔断和自动注册到eureka，注意需要导入eureka-client
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
