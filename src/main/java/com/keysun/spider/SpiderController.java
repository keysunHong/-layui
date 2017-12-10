package com.keysun.spider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by h on 2017/11/30.
 */
@Controller
public class SpiderController {
    @RequestMapping(value = "/spiderManager")
    public String spiderManager(HttpServletRequest request){
            return "spider_manager";
    }

    @RequestMapping(value = "/vueTest")
    public String vueTest(HttpServletRequest request){
        return "vue_test";
    }
}
