package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringController {

    @GetMapping("/home")
    public String helloworld(){
        // trying to connect to mariadb
        // your so skibiddy your so fanum tax
        return "hello";
    }

    @GetMapping("/home2")
    public String tohome2() {
        return "home2";
    }


    @GetMapping("/home3")
    public String helloworld3() {return "hello3";}

}
