package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository {

    List<Matricula> findByAlunoBairro(String bairro);

    List<Matricula> findAll();

    Matricula save(Matricula matricula);
}
