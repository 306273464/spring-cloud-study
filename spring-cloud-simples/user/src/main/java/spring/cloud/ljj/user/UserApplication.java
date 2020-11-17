package spring.cloud.ljj.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
