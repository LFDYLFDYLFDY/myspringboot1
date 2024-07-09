package ru.lfdy.myspringboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/index")
    public String doSomething(){
       return "index";
    }
    @GetMapping("/hello")
        public String helloRequest(Model model){
        model.addAttribute("name", "BOB");
         return "hello";
        }
   @GetMapping("/hello_new")
   public String helloNew(Model model, @RequestParam(value = "name", required = false) String name){
        model.addAttribute("name", name);
        return "hello";
   }
   @GetMapping("/cats")
   @ResponseBody
     public Cat catRequest(){
        return new Cat(1L,"bob");
//return "hello";
    }

}
