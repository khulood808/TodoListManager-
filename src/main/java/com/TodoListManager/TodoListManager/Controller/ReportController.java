package com.TodoListManager.TodoListManager.Controller;

import com.TodoListManager.TodoListManager.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "TodoListManagerDTO")
public class ReportController {
    @Autowired
    ReportService reportService;
    @RequestMapping(value ="getTodoListDTO",method = RequestMethod.GET)
    public void TodoListManagerDTO() throws Exception{
        //reportService.g


    }

}
