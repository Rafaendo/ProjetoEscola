/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.unincor.ProjetoEscola.model.domain.repository;

import com.unincor.ProjetoEscola.model.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alunos
 */
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
