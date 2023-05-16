package com.TodoListManager.TodoListManager.Repositry;

import com.TodoListManager.TodoListManager.Model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegisterRepositry extends JpaRepository<UserRegister,Integer> {
    UserRegister findByUsername(String username);
}
