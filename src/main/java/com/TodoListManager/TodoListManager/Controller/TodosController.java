package com.TodoListManager.TodoListManager.Controller;

import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Request.UserRequest;
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
    public String createTodos(@RequestBody UserRequest userRequest) {
        try {
            todosService.createTodo(userRequest);
        } catch (Exception e) {
            return "Todos creation Failed";   //Todos Creation
        }
        return "Todos created Successfully";
    }


    @RequestMapping(value = "getAllTodos", method = RequestMethod.GET)
    public List<Todos> getAllTodos() {
        List<Todos> todos = todosService.getAllTodos();
        return todos;
    }  //Todos Retrieval


    @RequestMapping(value = "updateTodos", method = RequestMethod.POST)
    public String updateTodos() {
        try {
            todosService.updateTodos(todos);
        } catch (Exception e) {
            return "Todos List Update Failed";
        }
        return "Todos List Updated Successfully";
    } //Todos Update

    @RequestMapping(value = "deleteTodos", method = RequestMethod.POST)
    public String deleteTodos(@RequestParam Todos todos) {
        try {
            todosService.deleteTodos(todos.getId());
        } catch (Exception e) {
            return "Todos List Update Failed";
        }
        return "Todos List Updated Successfully";
    } //Todos Delete

}
