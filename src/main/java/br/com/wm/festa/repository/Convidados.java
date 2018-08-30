package br.com.wm.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
