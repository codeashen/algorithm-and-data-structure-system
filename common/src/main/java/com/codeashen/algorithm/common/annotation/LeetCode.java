package com.codeashen.algorithm.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标识该类的一个 LeetCode 题解类
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface LeetCode {
    int id() default 0;

    String title() default "";

    String description() default "";

    Tag[] tag() default {};
}
