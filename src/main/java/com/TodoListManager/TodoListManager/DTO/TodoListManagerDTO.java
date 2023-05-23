package com.TodoListManager.TodoListManager.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TodoListManagerDTO {
    String username;
    String title;
    String description;

    public TodoListManagerDTO(String username, String title, String description) {
        this.username = username;
        this.title = title;
        this.description = description;
    }
}
