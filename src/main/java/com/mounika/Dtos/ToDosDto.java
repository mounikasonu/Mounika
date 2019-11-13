package com.mounika.Dtos;

import com.mounika.Entities.Todos;
import com.mounika.enums.ToDoStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;

@Data
@Setter
@Getter
public class ToDosDto {

    private Long id;

    private String discription;

    private String name;

    private Boolean isCompleted=false;

    private Long priority;

    private ToDoStatus toDoStatus;

}
