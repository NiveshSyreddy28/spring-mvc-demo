package com.zemoso.springdemo.mvc;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initbinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
        @Valid @ModelAttribute("customer") Customer customer,
        BindingResult bindingResult){

        System.out.println("FirstName: |"+customer.getFirstName()+"|");
        System.out.println("LastName: |"+customer.getLastName()+"|");

        System.out.println("Binding result: "+ bindingResult);
        System.out.println();

        if(bindingResult.hasErrors()){
            return "customer-form";
        }
        else {
            return "customer-confirmation";
        }

    }

}
