package com.TodoListManager.TodoListManager.Controller;

import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Todos")
public class TodosController {
    @Autowired
    TodosService todosService;

    @RequestMapping(value = "createTodos", method = RequestMethod.POST)
    public String createTodos(@RequestParam String title, String description, Boolean completed, Integer id) {
        try {
            todosService.createTodo(title,description,completed,id);
            return "Todos created Successfully";
        } catch (Exception e) {
            return "Todos creation Failed";   //Todos Creation
        }
    }


    @RequestMapping(value = "getTodoById", method = RequestMethod.GET)
    public List<Todos> getToDoById(@RequestParam Integer todosId){
        return todosService.getTodosIteamsById(todosId);
    }  //Todos Retrieval


    @RequestMapping(value = "updateTodos", method = RequestMethod.POST)
    public String updateTodos(@RequestParam Todos todos) {
        try {
            todosService.updateTodos(todos);
            return "Todos List Updated Successfully";
        } catch (Exception e) {
            return "Todos List Update Failed";
        }
    } //Todos Update



}
