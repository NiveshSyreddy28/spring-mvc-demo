package com.zemoso.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){

        //create a new Student Object
        Student student1 = new Student();

        //Add Student object to the model
        model.addAttribute("student",student1);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student")Student student1){

        //log the input data
        System.out.println("Student1: "+student1.getFirstName()+" "+student1.getLastName());
        return "student-confirmation";
    }
}
