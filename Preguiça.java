package POO3;

public class Pregui�a extends Animal{
	public String sobeEmArvores;

	public Pregui�a ()
	{
		super ();
	}
	
	public String possuiNome ()
	{
		String nome = "Pregui�a";
		return nome;
	}
	public String possuiIdade()
	{
		String idade = "50";
		return idade;
	}
	public String deveEmitirSom()
	{
		String som = "barulho de pregui�a";
		return som;
	}
	
	public String getsobeEmArvores() {
		this.sobeEmArvores = "sobe em �rvores";
		return sobeEmArvores;
	}
	
	public String getPregui�a()
	{
		return ("O animal �: "+possuiNome()+". Tem "+possuiIdade()+" anos, emite "+deveEmitirSom()+ " e "+getsobeEmArvores()+".");
	}
	

}
