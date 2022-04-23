package com.tutors.tutors.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AtendimentoController {
    @PostMapping(path = "/api/atendimento")
    public String create () {

        return "create";
    }

    @PutMapping(path = "/api/atendimento")
    public String update () {

        return "update";
    }

    @DeleteMapping(path = "/api/atendimento")
    public String delete () {

        return "delete";
    }
}
