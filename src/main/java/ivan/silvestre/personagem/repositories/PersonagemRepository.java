package ivan.silvestre.personagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ivan.silvestre.personagem.domain.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {

}
