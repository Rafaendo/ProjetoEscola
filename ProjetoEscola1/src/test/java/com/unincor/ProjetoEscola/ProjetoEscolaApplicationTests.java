package com.unincor.ProjetoEscola;


import com.unincor.ProjetoEscola.model.domain.Aluno;
import com.unincor.ProjetoEscola.model.domain.repository.AlunoRepository;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjetoEscolaApplicationTests {

    @Autowired
    private AlunoRepository alunoRepo;

    @Test
    void contextLoads() {
        Aluno c1 = new Aluno(null, "ALuno 1", 
                "123456", new Date(), new Date());
        Aluno c2 = new Aluno(null, "Aluno 3", 
                "789465", new Date(), new Date());
        Aluno c3 = new Aluno(null, "Aluno 3", 
                "159753", new Date(), new Date());
        
        alunoRepo.save(c1);
        alunoRepo.save(c2);
        alunoRepo.save(c3);
    }
}
