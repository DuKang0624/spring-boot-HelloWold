package com.dukang.springBootDemo;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * @author DUKANG
 * @create 2018/08/06
 * @since 1.0.0
 * Description: spring-boot启动类
 */
@SpringBootApplication
public class RunHello {
    public static void main(String[] args) {
        SpringApplication.run(RunHello.class, args);
    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        //1,定义一个converter消息转换对象
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //2,添加fastJson配置信息
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3,将配置信息添加到converter中
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter converters = fastJsonHttpMessageConverter;
        return new HttpMessageConverters(converters);

    }
}
