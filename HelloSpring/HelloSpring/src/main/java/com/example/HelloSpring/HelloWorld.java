package com.example.HelloSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HelloWorld {
    // @GetMapping("/HelloWorld")
    @ResponseBody
    public String showMessage(){
        return "webiwabo :D!";
    }
}
