package unicamp.ic.mc322.model;

public enum Desconto {
	varejo(0.05),
	atacado(0.15),
	fator_5_15(0.05),
	fator_15_20(0.075),
	fator_20(0.10);

	private Double porcentagem;

	Desconto(Double porceDouble) {
		this.porcentagem = porceDouble;
	}

	public Double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}

}
