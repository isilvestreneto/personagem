package ivan.silvestre.personagem.domain.enums;

public enum TipoArma {

	CORPO_A_CORPO(1, "corpo à corpo"), A_DISTANCIA(2, "à distância");

	private int cod;
	private String descricao;

	private TipoArma(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoArma toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoArma x : TipoArma.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);

	}
}