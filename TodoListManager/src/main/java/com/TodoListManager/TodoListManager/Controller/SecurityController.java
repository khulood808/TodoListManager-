package com.TodoListManager.TodoListManager.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class SecurityController {
    @RestController
    @RequestMapping(value = "general")
    public class GeneralController {
        @GetMapping(value = "/testForAdmin")
        @PreAuthorize("hasRole('USER')")
        public String testForAdmin() {
            return "it works for admin";
        }
    }
}



