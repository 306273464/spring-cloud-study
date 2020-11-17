package spring.cloud.ljj.user.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.cloud.ljj.user.vo.User;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@FeignClient("order")
public interface UserFeginClient {

    //    @RequestMapping(value = "/order/{id}/{name}", method = RequestMethod.GET)
    @GetMapping("/order/{id}/{name}")
    User getOrder(@PathVariable String id, @PathVariable String name);

}
