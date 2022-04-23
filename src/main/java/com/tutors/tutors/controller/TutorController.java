package com.tutors.tutors.controller;
import com.tutors.tutors.model.TutorModel;
import com.tutors.tutors.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TutorController {
    @Autowired
    private TutorRepository repository;

    @GetMapping(path = "/api/tutor")
    public Iterable<TutorModel> consultar () {
        return repository.findAll();
    }

    @PostMapping(path = "/api/tutor")
    public TutorModel criar (@RequestBody TutorModel tutor) {
        System.out.println("OPAAAAAAAAA");
        return repository.save(tutor);
    }
}
