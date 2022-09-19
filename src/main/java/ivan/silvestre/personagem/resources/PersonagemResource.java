package ivan.silvestre.personagem.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ivan.silvestre.personagem.domain.Personagem;
import ivan.silvestre.personagem.services.PersonagemService;

@RestController
@RequestMapping(value = "/personagens")
public class PersonagemResource {

	@Autowired
	private PersonagemService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Personagem obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
