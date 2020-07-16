package POO3;

public class Cachorro extends Animal {
	public String corre;

	public Cachorro ()
	{
		super ();
	}
	
	public String possuiNome ()
	{
		String nome = "Cachorro";
		return nome;
	}
	public String possuiIdade()
	{
		String idade = "12";
		return idade;
	}
	public String deveEmitirSom()
	{
		String som = "au au";
		return som;
	}
	
	public String getCorre() {
		this.corre = "corre";
		return corre;
	}
	
	public String getCachorro()
	{
		return ("O animal é: "+possuiNome()+". Tem "+possuiIdade()+" anos, emite "+deveEmitirSom()+ " e "+getCorre()+".");
	}
	

}
