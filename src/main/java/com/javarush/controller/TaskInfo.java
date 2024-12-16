package com.javarush.controller;

import com.javarush.domain.Status;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskInfo {
    private String description;
    private Status status;

}
