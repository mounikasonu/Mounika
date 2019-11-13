package com.mounika.Entities;

import com.mounika.enums.ToDoStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String discription;

    private String name;

    private Boolean isCompleted=false;

    private Long priority;

    @Enumerated(EnumType.STRING)
    private ToDoStatus toDoStatus;

}
