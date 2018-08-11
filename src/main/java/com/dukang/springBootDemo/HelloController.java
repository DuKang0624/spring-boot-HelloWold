package com.dukang.springBootDemo; /**
 * @author DUKANG
 * @create 2018/08/06
 * @since 1.0.0
 * Description: spring-boot的helloWorld
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 使用RestController相当于 @Controller 和 @RequestBody
 */
@RestController
public class HelloController {
    /**
     *使用RequestMapping建立请求映射
     * @return
     */
    @RequestMapping("/hello")
    public String helloWold() {
        return "Hello-2018";
    }
    /**
     * springboot 解析json数据
     * @return
     */
    @RequestMapping("/getJson")
    public JsonDemo getJsonStr() {
        JsonDemo jsonDemo = new JsonDemo();
        jsonDemo.setAge(1);
        jsonDemo.setName("李四");
        jsonDemo.setCreateDate(new Date());
        jsonDemo.setRemarks("备注字段");
        return jsonDemo;
    }

    @RequestMapping("/hello2")
    public String helloWold2() {
        return "Hello2";
    }
}
