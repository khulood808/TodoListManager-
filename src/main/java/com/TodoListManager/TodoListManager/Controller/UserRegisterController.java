package com.TodoListManager.TodoListManager.Controller;



import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
    public List<UserRegister> getAllUser() {
        List<UserRegister> userRegisterList = userRegisterService.getAllUser();
        return userRegisterList;
    }//Todos Retrieval (All todos)

}
