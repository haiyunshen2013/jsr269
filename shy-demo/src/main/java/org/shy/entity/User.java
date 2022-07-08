package org.shy.entity;

import org.shy.annotation.Data;

import java.time.LocalDateTime;

/**
 * 描述
 *
 * @author shy
 * @since 2022/7/8
 */
@Data
public class User {
    private String id;

    private String name;

    private LocalDateTime birthday;

    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        System.out.println(user);
    }
}
