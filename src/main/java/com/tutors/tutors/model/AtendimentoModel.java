package com.tutors.tutors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendimento")
public class AtendimentoModel {
    @Id
    public Integer codigo;
    @Column(nullable = false, length = 50)

    public String atendimento;
    @Column()

    public Integer tutorId;

    @Column()
    public Integer alunoId;

    public String room_meet;

    public String getRoom_meet() {
        return room_meet;
    }

    public void setRoom_meet(String room_meet) {
        this.room_meet = room_meet;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }
}
