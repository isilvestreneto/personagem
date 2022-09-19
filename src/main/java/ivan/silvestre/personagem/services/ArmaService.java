package ivan.silvestre.personagem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ivan.silvestre.personagem.domain.Arma;
import ivan.silvestre.personagem.repositories.ArmaRepository;
import ivan.silvestre.personagem.services.exceptions.ObjectNotFoundException;

@Service
public class ArmaService {

	@Autowired
	private ArmaRepository repo;

	public Arma find(Integer id) {
		Optional<Arma> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Arma.class.getName()));
	}

}
