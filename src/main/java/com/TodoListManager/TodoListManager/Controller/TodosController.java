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
    }//Todos Creation



    @RequestMapping(value = "getAllTodos", method = RequestMethod.GET)
    public List<Todos> getAllTodos() {
        List<Todos> todos = todosService.getAllTodos();
        return todos;
    }//Todos Retrieval (All todos)


    @RequestMapping(value = "getTodosById", method = RequestMethod.GET)
    public Todos getTodosById(@RequestParam Integer todosId){
        Todos todos = todosService.getTodosById(todosId);
        return todos;
    }//Todos Retrieval (Single todos)

    @RequestMapping(value = "updateTodos", method = RequestMethod.POST)
    public String updateTodos(@RequestBody Todos todos) {
        try {
            todosService.updateTodos(todos);
        } catch (Exception e) {
            return "Todos List Update Failed";
        }
        return "Todos List Updated Successfully";
    } //Todos Update


    @RequestMapping(value = "deleteTodos", method = RequestMethod.POST)
    public String deleteTodos(Integer id) {
        try {
            todosService.deleteTodos(id);
            return "Todos Deleted Successfully";
        }catch (Exception e){
            return "Todos Deleted Failed";
        }
    }//Todos Delete

}
