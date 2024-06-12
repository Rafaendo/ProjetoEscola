/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.ProjetoEscola.controller;


import com.unincor.ProjetoEscola.model.domain.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.ResponseStatus;



import com.unincor.ProjetoEscola.model.domain.Turma;

@RestController
@RequestMapping("/turma")
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepo;
    
    @GetMapping("/listar")
    public String listarTurmas() {
        StringBuilder turmas = new StringBuilder();
        List<Turma> turmaLista = turmaRepo.findAll();
        for (Turma turma : turmaLista) {
            turmas.append(turma.toString()).append("</br>");
        }
        return turmas.toString();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarTurma(@RequestBody Turma turma) {
        turmaRepo.save(turma);
    }
}
