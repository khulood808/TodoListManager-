package com.TodoListManager.TodoListManager.Controller;


import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "UserRegister")
public class UserRegisterController {
    @Autowired
    UserRegisterService userRegisterService;

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(value = "createUser", method = RequestMethod.POST)

    public String createUser(@RequestParam String username, String password) {
        try {
            userRegisterService.createUser(username,password);
            return "Account created Successfully";
        } catch (Exception e) {
            return "Account creation Failed";  //User Registration
        }
    }

}
