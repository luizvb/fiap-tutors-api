package com.tutors.tutors.controller;
import com.tutors.tutors.model.AlunoModel;
import com.tutors.tutors.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping(path = "/api/aluno")
    public ResponseEntity consultar () {
        return (ResponseEntity) repository.findAll();
    }

    @PostMapping(path = "/api/aluno")
    public AlunoModel create (@RequestBody AlunoModel aluno) {
        System.out.println("OPAAAAAAAAA");
        return repository.save(aluno);
    }

    @PutMapping(path = "/api/aluno")
    public String update () {
        return "update";
    }

    @DeleteMapping(path = "/api/aluno")
    public String delete () {
        return "delete";
    }
}
