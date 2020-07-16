package POO3;

public class Cavalo extends Animal{
	public String corre;

	public Cavalo ()
	{
		super ();
	}
	
	public String possuiNome ()
	{
		String nome = "Cavalo";
		return nome;
	}
	public String possuiIdade()
	{
		String idade = "5";
		return idade;
	}
	public String deveEmitirSom()
	{
		String som = "ireeee";
		return som;
	}
	
	public String getCorre() {
		this.corre = "corre";
		return corre;
	}
	
	public String getCavalo()
	{
		return ("O animal é: "+possuiNome()+". Tem "+possuiIdade()+" anos, emite "+deveEmitirSom()+ " e "+getCorre()+".");
	}
	

}
