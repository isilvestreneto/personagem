package ivan.silvestre.personagem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ivan.silvestre.personagem.domain.Personagem;
import ivan.silvestre.personagem.repositories.PersonagemRepository;
import ivan.silvestre.personagem.services.exceptions.ObjectNotFoundException;

@Service
public class PersonagemService {

	@Autowired
	private PersonagemRepository repo;

	public Personagem find(Integer id) {
		Optional<Personagem> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Personagem.class.getName()));
	}

	public Personagem insert(Personagem obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Personagem update(Personagem obj) {
		find(obj.getId());
		
		return repo.save(obj);
	}

}
