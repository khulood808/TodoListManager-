package com.TodoListManager.TodoListManager.Repositry;

import com.TodoListManager.TodoListManager.Model.Todos;
import com.TodoListManager.TodoListManager.Model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodosRepositry extends JpaRepository<Todos,Integer> {
    List<Todos> findAllById(Integer id);
    @Query(value = "SELECT t from Todos t where t.id =:todosId")
    Todos getTodosIteamsById(@Param("todosId")Integer todosId);

    @Query("Select u from Todos u")
    List<Todos> getAllTodos();



}
