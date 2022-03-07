package br.com.estados.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estados.domain.Estado;
import br.com.estados.exception.ObjectNotFoundException;
import br.com.estados.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	public List<Estado> findAll() {
		return repository.findAll();
	}

	public Estado findById(Long id) {
		Optional<Estado> estado = repository.findById(id);
		if (estado.isEmpty()) {
			throw new ObjectNotFoundException(id, Estado.class);
		}
		return estado.get();
	}

	public Estado insert(Estado estado) {
		return repository.save(estado);
	}

	public Estado update(Long id, Estado estado) {
		if (repository.existsById(id)) {
			estado.setId(id);
			return repository.save(estado);
		}
		throw new ObjectNotFoundException(id, Estado.class);
	}

	public Estado delete(Long id) {
		Optional<Estado> estado = repository.findById(id);
		if (estado.isEmpty()) {
			throw new ObjectNotFoundException(id, Estado.class);
		}
		repository.delete(estado.get());
		return estado.get();
	}

}
