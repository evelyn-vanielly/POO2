package POO3;

public abstract class Animal {
	 private String possuiNome;
	 private String possuiIdade;
	 private String deveEmitirSom;
	
	public Animal ()
	{
		
	}

	public String getPossuiNome() {
		return possuiNome;
	}

	public void setPossuiNome(String possuiNome) {
		this.possuiNome = possuiNome;
	}

	public String getPossuiIdade() {
		return possuiIdade;
	}

	public void setPossuiIdade(String possuiIdade) {
		this.possuiIdade = possuiIdade;
	}

	public String getDeveEmitirSom() {
		return deveEmitirSom;
	}

	public void setDeveEmitirSom(String deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}

	
	
	
}
