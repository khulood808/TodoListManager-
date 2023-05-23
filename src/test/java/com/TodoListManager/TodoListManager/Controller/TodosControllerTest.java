package com.TodoListManager.TodoListManager.Controller;

import com.TodoListManager.TodoListManager.Model.Todos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TodosControllerTest {
@Autowired
TodosController todosController;
    @Test
    void getAllTodos() {
        List<Todos> allTododsTest = todosController.getAllTodos();
        assertNotNull(allTododsTest);
    }

    @Test
    void updateTodos() {
        String updateTodos = todosController.updateTodos();
        assertNotNull(updateTodos);
    }


    @Test
    void deleteTodos() {

    }
}