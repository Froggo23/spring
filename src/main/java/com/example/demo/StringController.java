package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringController {

    @GetMapping("/home")
    public String helloworld(){
        // trying to connect to mysql
        // sticking out your gyatt for the rizzler
        return "hello";
    }
    



    @GetMapping("/home3")
    public String helloworld3() {return "hello3";}

}
