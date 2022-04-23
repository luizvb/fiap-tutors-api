package com.tutors.tutors.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TutorController {
    @PostMapping(path = "/api/tutor")
    public String create () {

        return "create";
    }

    @PutMapping(path = "/api/tutor")
    public String update () {

        return "update";
    }

    @DeleteMapping(path = "/api/tutor")
    public String delete () {

        return "delete";
    }
}
