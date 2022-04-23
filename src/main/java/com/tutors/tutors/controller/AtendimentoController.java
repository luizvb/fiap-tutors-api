package com.tutors.tutors.controller;
import com.tutors.tutors.model.AlunoModel;
import com.tutors.tutors.model.AtendimentoModel;
import com.tutors.tutors.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AtendimentoController {
    @Autowired
    private AtendimentoRepository repository;

    @PostMapping(path = "/api/atendimento")
    public AtendimentoModel iniciarAtendimento(@RequestBody AtendimentoModel atendimento) {
        repository.save(atendimento);
        String url_meet = "https://hello.freeconference.com/conf/call/9085561";  //mvp
        atendimento.setRoom_meet(url_meet);
        return atendimento;
    }
}
