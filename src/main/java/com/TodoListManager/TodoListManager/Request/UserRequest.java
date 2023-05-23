package com.TodoListManager.TodoListManager.Request;

import com.TodoListManager.TodoListManager.Model.UserRegister;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserRequest {
    String title;
    String description;
    UserRegister user_id;
    Boolean completed;

}
