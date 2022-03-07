package br.com.estados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estados.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
