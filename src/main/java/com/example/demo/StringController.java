package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringController {

    @GetMapping("/home")
    public String helloworld(){
        return "hello";
    }

    @GetMapping("/home2")
    public String ontohome2() {
        return "home2";
    }


}
