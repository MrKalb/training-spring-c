package br.com.treinamento.treinamento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.treinamento.entities.Balaio;
import org.springframework.stereotype.Repository;

@Repository
public interface BalaioRepository extends JpaRepository<Balaio, Long> {

    Optional<Balaio> findByMaterialTipo(String tipo);

}
