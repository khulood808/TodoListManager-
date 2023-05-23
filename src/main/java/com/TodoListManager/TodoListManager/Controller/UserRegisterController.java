package com.TodoListManager.TodoListManager.Controller;



import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "UserRegister")
public class UserRegisterController {
    @Autowired
    UserRegisterService userRegisterService;

//    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public String createUser(@RequestBody UserRegister userRegister) {
        try {
            userRegisterService.createUser(userRegister);
        } catch (Exception e) {
            return "Account creation Failed";  //User Registration
        }
        return "Account created Successfully";
    }

}
