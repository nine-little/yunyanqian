package org.yanmai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyang on 2020/2/10.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "test";
    }
}
