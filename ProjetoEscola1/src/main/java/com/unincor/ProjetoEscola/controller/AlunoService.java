/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.ProjetoEscola.controller;

import com.unincor.ProjetoEscola.model.domain.Aluno;
import com.unincor.ProjetoEscola.model.domain.repository.AlunoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author alunos
 */

import java.util.List;

@RestController
@RequestMapping("/aluno")
class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepo;

    @GetMapping("/listar")
    public List<Aluno> listarAlunos() {
        return alunoRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarAluno(@RequestBody Aluno aluno) {
        alunoRepo.save(aluno);
    }
}