package ru.lfdy.myspringboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/index")
    public String doSomething(){
       return "index";
    }
    @GetMapping("/hello")
        public String helloRequest(){
         return "hello";
        }
   @GetMapping("/cats")
   @ResponseBody
     public Cat catRequest(){
        return new Cat(1L,"bob");
//return "hello";
    }

}
