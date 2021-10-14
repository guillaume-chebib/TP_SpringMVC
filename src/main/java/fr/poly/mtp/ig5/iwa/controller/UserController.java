package fr.poly.mtp.ig5.iwa.controller;

import fr.poly.mtp.ig5.iwa.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value="nom",defaultValue="defaultNom") String nom,
                        @RequestParam(value="prenom",defaultValue="defaultPrenom") String prenom,
                        @RequestParam(value="age",defaultValue="23") int age){

        return new User(nom,prenom,age);

    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
