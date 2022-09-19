package ivan.silvestre.personagem.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ivan.silvestre.personagem.domain.enums.TipoArma;

@Entity
public class Arma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nomeArma;
	private Integer preco;
	private TipoArma tipoArma;
	private Integer danoArma;
	private Integer distancia; // 18 pra arco, 0 para corpo a corpo
	private String tipo;

	@JsonIgnore
	@ManyToOne
	private Personagem personagem;

	public Arma() {

	}

	public Arma(Integer id, String nomeArma, Integer preco, TipoArma tipoArma, Integer dano, Integer distancia,
			String tipo, Personagem personagem) {

		this.id = id;
		this.nomeArma = nomeArma;
		this.preco = preco;
		this.tipoArma = tipoArma;
		this.danoArma = dano;
		this.distancia = distancia;
		this.tipo = tipo;
		this.personagem = personagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeArma() {
		return nomeArma;
	}

	public void setNomeArma(String nomeArma) {
		this.nomeArma = nomeArma;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public TipoArma getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	public Integer getDanoArma() {
		return danoArma;
	}

	public void setDanoArma(Integer danoArma) {
		this.danoArma = danoArma;
	}

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return Objects.equals(id, other.id);
	}

}
