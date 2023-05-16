package com.TodoListManager.TodoListManager.Service;

import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Model.UserRegister;
import com.TodoListManager.TodoListManager.Repositry.TodosRepositry;
import com.TodoListManager.TodoListManager.Repositry.UserRegisterRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {
    @Autowired
    TodosRepositry todosRepositry;
    @Autowired
    UserRegisterRepositry userRegisterRepositry;

    public void createTodo(String title,String description,Boolean completed, Integer id) {
        Todos create = new Todos();
        create.setTitle(title);
        create.setDescription(description);
        create.setCompleted(completed);
        UserRegister userRegister = userRegisterRepositry.findById(id).get();
        create.setId(id);
        todosRepositry.save(create);
    } //Todos Creation

    public List<Todos> getTodosIteamsById(Integer todosId){
        return todosRepositry.findAllById(todosId);
    } //Todos Retrieval


    public void updateTodos(Todos todos) {
        Todos todosUpdate = new Todos();
        todosUpdate.setCompleted(false);
        todosUpdate.setDescription("Description");
        todosRepositry.save(todosUpdate);
    } //Todos Update

    public void deleteTodos(Integer id) {
        Todos todosUpdate = todosRepositry.findById(id).get();
        todosUpdate.setDescription("Description");
        todosRepositry.save(todosUpdate);
    }

}
