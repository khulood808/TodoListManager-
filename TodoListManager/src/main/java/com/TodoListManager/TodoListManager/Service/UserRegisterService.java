package com.TodoListManager.TodoListManager.Service;

import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Repositry.TodosRepositry;
import com.TodoListManager.TodoListManager.Repositry.UserRegisterRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
    @Autowired
    UserRegisterRepositry userRegisterRepositry;
    @Autowired
    TodosRepositry todosRepositry;
    public void createUser(String username,String password) {
        UserRegister create = new UserRegister();
        create.setUsername(username);
        create.setPassword(password);
        userRegisterRepositry.save(create);
    }
}
