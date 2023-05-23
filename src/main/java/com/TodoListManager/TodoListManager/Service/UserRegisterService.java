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
    public String createUser(UserRegister todos) {
        UserRegister create = new UserRegister();
        create.setUsername(todos.getUsername());
        create.setPassword(todos.getPassword());
        userRegisterRepositry.save(create);
        return "Created Successfully";
    }
}
