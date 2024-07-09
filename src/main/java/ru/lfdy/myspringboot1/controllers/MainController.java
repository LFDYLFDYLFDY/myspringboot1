package ru.lfdy.myspringboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
//   public String helloNew(Model model, @PathVariable(value = "name") String name){
        model.addAttribute("name", name);
        return "hello";
   }

    @GetMapping("/hello_new2/{name}")
//   public String helloNew(Model model, @RequestParam(value = "name", required = false) String name){
    public String helloNew2(Model model, @PathVariable(value = "name", required = false) String name){
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
