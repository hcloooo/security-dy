package com.nacl.securitydy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 赵益江
 * @version 1.0
 * @date 2020/2/11 0011 14:05
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/dba/hello")
    public String hellodba() {
        return "hello dba";
    }

    @GetMapping("/admin/hello")
    public String helloadmin() {
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String hellouser() {
        return "hello user";
    }

}
