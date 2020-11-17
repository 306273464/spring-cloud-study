package spring.cloud.ljj.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.cloud.ljj.user.vo.User;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${order.url}")
    private String url;

    @GetMapping("/user/{id}/{name}")
    String getUserOrder(@PathVariable String id, @PathVariable String name) {
        return restTemplate.getForObject(url + "/" + id + "/" + name, User.class).toString();
    }
}
