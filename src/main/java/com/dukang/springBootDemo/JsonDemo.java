package com.dukang.springBootDemo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author DUKANG
 * @create 2018/08/08
 * @since 1.0.0
 * Description: spring-boot解析json数据的实体类
 */
public class JsonDemo {

    private int age;

    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createDate;
    //serialize 是否需要序列化字段
    //@JSONField(serialize = false)
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
