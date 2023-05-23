package com.TodoListManager.TodoListManager.Service;

import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Repositry.TodosRepositry;
import com.TodoListManager.TodoListManager.Repositry.UserRegisterRepositry;
import com.TodoListManager.TodoListManager.Request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {
    @Autowired
    TodosRepositry todosRepositry;
    @Autowired
    UserRegisterRepositry userRegisterRepositry;

    public String createTodo(UserRequest userRequest) {
        Todos create = new Todos();
        create.setTitle(userRequest.getTitle());
        create.setDescription(userRequest.getDescription());
        create.setCompleted(userRequest.getCompleted());
        create.setUserRegister(userRequest.getUser_id());
        todosRepositry.save(create);
        return "Created Successfully";
    } //Todos Creation

    public List<Todos> getAllTodos() {

        return todosRepositry.getAllTodos();
    } //Todos Retrieval

    public Todos getTodosById(Integer todosId){
        Todos todos = todosRepositry.getTodosById(todosId);
        return todos;
    }

    public void updateTodos(Todos todos) {
        Todos todosUpdate = new Todos();
        todosUpdate.setCompleted(false);
        todosUpdate.setDescription("Description");
        todosRepositry.save(todosUpdate);
    } //Todos Update

    public void deleteTodos(Integer id) {
        todosRepositry.deleteById(id);
    }//Todos Delete

}
