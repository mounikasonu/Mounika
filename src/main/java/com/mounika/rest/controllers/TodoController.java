package com.mounika.rest.controllers;

import com.mounika.Dtos.ToDosDto;
import com.mounika.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    private ToDoService toDoService;

    @PostMapping("/add-todos-details")
    public void addDetailsToToDoList(@RequestBody ToDosDto toDosDto){
        //TODO::
         toDoService.addDetails(toDosDto);

    }
}
