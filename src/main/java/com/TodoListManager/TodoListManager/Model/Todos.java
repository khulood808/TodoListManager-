package com.TodoListManager.TodoListManager.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class Todos extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    String title;
    String description;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName="id")
    UserRegister userRegister;
}
