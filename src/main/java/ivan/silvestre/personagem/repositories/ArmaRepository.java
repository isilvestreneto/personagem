package ivan.silvestre.personagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ivan.silvestre.personagem.domain.Arma;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Integer> {

}
