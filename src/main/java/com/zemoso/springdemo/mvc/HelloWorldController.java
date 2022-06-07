package com.zemoso.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //define a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //define a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    //define a controller method to read form data and add data to the model
    @RequestMapping("/processName")
    public String modifyName(HttpServletRequest request, Model model){

        //read request parameter from the HTML form
        String name = request.getParameter("studentName");

        //Convert the name to all caps
        name = name.toUpperCase();

        //Add the name to model
        model.addAttribute("message",name);

        return "helloWorld";
    }

    @RequestMapping("/processNameWithRequestParam")
    public String modifyNameWithRequestparam(@RequestParam("studentName")String name, Model model){

        //Convert the name to all caps
        name = name.toUpperCase();

        //Create a result
        String result = "Modified name using @Requestparam "+name;

        //Add the name to model
        model.addAttribute("message",result);

        return "helloWorld";
    }
}
