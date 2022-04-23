package com.tutors.tutors.controller;
import com.tutors.tutors.model.AlunoModel;
import com.tutors.tutors.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping(path = "/api/aluno")
    public Iterable<AlunoModel> consultar () {
        return repository.findAll();
    }

    @PostMapping(path = "/api/aluno")
    public AlunoModel criar (@RequestBody AlunoModel aluno) {
        System.out.println("OPAAAAAAAAA");
        return repository.save(aluno);
    }
}
