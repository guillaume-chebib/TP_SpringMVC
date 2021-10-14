package fr.poly.mtp.ig5.iwa.controller;

import fr.poly.mtp.ig5.iwa.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;


@Controller
public class RegistrationController {


    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){
        System.out.println(registration);
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result){
        if(result.hasErrors()){
            return "registration";
        }
        System.out.println(registration);
        return "redirect:registration";
    }

    @GetMapping("home")
    public String getHome(Map<String,Object > model){
        model.put("message","Fantastic Thymeleaf!!!");
        return "home";

    }
}
