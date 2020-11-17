package spring.cloud.ljj.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.ljj.order.vo.Order;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@RestController
public class OrderController {

    @GetMapping("/order/{id}/{name}")
    Order getOrder(@PathVariable String id, @PathVariable String name) {
        return new Order(id, name);
    }
}
