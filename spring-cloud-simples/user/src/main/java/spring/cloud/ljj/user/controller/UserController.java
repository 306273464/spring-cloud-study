package spring.cloud.ljj.user.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.cloud.ljj.user.fegin.UserFeginClient;
import spring.cloud.ljj.user.vo.User;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@RestController
@EnableFeignClients
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private UserFeginClient userFeginClient;

    @Value("${order.url}")
    private String url;

    @GetMapping("/user/{id}/{name}")
    public User getUserOrder(@PathVariable String id, @PathVariable String name) {
//        InstanceInfo orderInstance = eurekaClient.getNextServerFromEureka("ORDER", false);
//        String uri = orderInstance.getHomePageUrl() + "/order/" + id + "/" + name;
//        // 通过rest 请求获取到json数据，然后转换为user实例
//        return restTemplate.getForObject(uri, User.class);

        return userFeginClient.getOrder(id, name);
    }

    @GetMapping("/userInfo")
    public String userInfo() {
        InstanceInfo orderInstance = eurekaClient.getNextServerFromEureka("ORDER", false);
        return orderInstance.getHomePageUrl();
    }
}
