package com.wisely.highlight_springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 凯 on 2016/11/18.
 */
@Controller // 1
public class HelloController {

    @RequestMapping("/index") // 2
    public String hello() {
        return "index"; // 3
    }
}
