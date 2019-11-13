package com.mounika.serviceimpl;

import com.mounika.Dtos.ToDosDto;
import com.mounika.Entities.Todos;
import com.mounika.Repo.ToDORepo;
import com.mounika.enums.ToDoStatus;
import com.mounika.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    private ToDORepo toDORepo;

    @Override
    public void addDetails(ToDosDto toDosDto) {

        Todos todos=new Todos();
        todos.setDiscription(toDosDto.getDiscription());
        todos.setName(toDosDto.getName());
        todos.setToDoStatus(ToDoStatus.NOT_STARTED);
        toDORepo.save(todos);




    }
}
