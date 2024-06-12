/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.ProjetoEscola.controller;

import com.unincor.ProjetoEscola.model.domain.Professor;
import com.unincor.ProjetoEscola.model.domain.repository.ProfessorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping("/professor")
class ProfessorService {
 @Autowired
    private ProfessorRepository professorRepository;
    
    @GetMapping("/listar")
    public List<Professor> listarProfessores() {
        return professorRepository.findAll();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvarProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
    }
}