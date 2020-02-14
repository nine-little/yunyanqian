package org.yanmai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuyang on 2020/2/10.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
