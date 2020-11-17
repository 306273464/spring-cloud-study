package spring.cloud.ljj.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ljj
 * @Date 2020/11/17 0017
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private String name;
}
