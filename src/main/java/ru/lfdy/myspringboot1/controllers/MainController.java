package ru.lfdy.myspringboot1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return new Cat(1L,"bob","black");
//return "hello";
    }
    @GetMapping("/form")
public String formRequest(){
        return "simple_form";


    }
    @PostMapping("/form")
    public String saveForm(@RequestParam(value = "name") String name,
                           @RequestParam(value = "email") String email){
        System.out.println(name);
        System.out.println(email);
        return "redirect:/index";

    }
    @GetMapping("/addcat")
    public String addCat(Model model){
//        model.addAttribute("cat", new Cat());
        Cat cat = new Cat(1L,"bob","black");
        model.addAttribute("cat",cat);
        return "cat_form";
    }

    @PostMapping("/addcat")
    public String saveCat(
           @ModelAttribute(value = "cat") Cat cat)
    {

        System.out.println(cat.getId()+" "+cat.getName()+ " "+ cat.getColor());
         return "redirect:/index";
    }
}
