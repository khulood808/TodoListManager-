package com.TodoListManager.TodoListManager.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
public class UserRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    String username;
    String password;
}
