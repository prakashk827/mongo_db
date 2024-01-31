package com.learn.mongodb.app.controller;

import com.learn.mongodb.app.model.TodoDTO;
import com.learn.mongodb.app.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public ResponseEntity<?> getAllTodos() {
        List<TodoDTO> todoList = todoRepository.findAll();

        if (!todoList.isEmpty()) {
            return new ResponseEntity<>(todoList, HttpStatus.OK);
        }

        return new ResponseEntity<>("No Records found",HttpStatus.NOT_FOUND);

    }
}
