package com.sky.annotation;

import com.sky.enumeration.OperationType;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识mapper中需要对公共字段填充的处理
 */
@Target(ElementType.METHOD) //指定注解只能加在方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型：UPDATE INSET
    OperationType value();
}
