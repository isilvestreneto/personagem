package ivan.silvestre.personagem;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ivan.silvestre.personagem.domain.Arma;
import ivan.silvestre.personagem.domain.Personagem;
import ivan.silvestre.personagem.domain.enums.TipoArma;
import ivan.silvestre.personagem.repositories.ArmaRepository;
import ivan.silvestre.personagem.repositories.PersonagemRepository;

@SpringBootApplication
public class PersonagemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonagemApplication.class, args);
	}

	@Autowired
	private PersonagemRepository personagemRepository;
	@Autowired
	private ArmaRepository armaRepository;

	@Override
	public void run(String... args) throws Exception {

		Personagem p1 = new Personagem(null, "Litziel", "Curandeira", 3, 5, 20);
		Personagem p2 = new Personagem(null, "Ogledino", "Guerreiro", 5, 50, 30);
		
		Arma a1 = new Arma(null, "Cantil", 5, TipoArma.A_DISTANCIA, 0, 0, "Revitalização", p1);
		Arma a2 = new Arma(null, "Adaga", 15, TipoArma.CORPO_A_CORPO, 5, 0, "Perfuração", p1);
		
		Arma a3 = new Arma(null, "Espada curta", 30, TipoArma.CORPO_A_CORPO, 30, 0, "Perfuração", p2);
		Arma a4 = new Arma(null, "Clava", 30, TipoArma.CORPO_A_CORPO, 50, 5, "Esmagamento", p2);
		
		p1.getArma().addAll(Arrays.asList(a1, a2));
		
		personagemRepository.saveAll(Arrays.asList(p1, p2));
		armaRepository.saveAll(Arrays.asList(a1, a2, a3, a4));

	}

}
