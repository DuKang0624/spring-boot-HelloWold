package com.dukang.defaultException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author DUKANG
 * @create 2018/08/15
 * @since 1.0.0
 * Description: 全局异常捕捉
 * 全局异常捕捉类定义步骤：
 *  1，在类上加注解：@ControllerAdvice
 *  2，添加一个方法，在 方法上添加@ExceptionHandler拦截相关的异常信息
 *  3，如果返回的是view -- 方法的返回值是ModelAndView；
 *  3，如果返回的是String或者Json数据，那么需要在方法上添加@ResponseBody注解
 */
@ControllerAdvice
public class DefaultExceptionHandler {


    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String defaultExceptionHandler (HttpServletRequest request, Exception e) {
        return "对不起，系统繁忙！";
    }
}
