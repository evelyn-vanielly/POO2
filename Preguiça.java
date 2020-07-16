package POO3;

public class Preguiça extends Animal{
	public String sobeEmArvores;

	public Preguiça ()
	{
		super ();
	}
	
	public String possuiNome ()
	{
		String nome = "Preguiça";
		return nome;
	}
	public String possuiIdade()
	{
		String idade = "50";
		return idade;
	}
	public String deveEmitirSom()
	{
		String som = "barulho de preguiça";
		return som;
	}
	
	public String getsobeEmArvores() {
		this.sobeEmArvores = "sobe em árvores";
		return sobeEmArvores;
	}
	
	public String getPreguiça()
	{
		return ("O animal é: "+possuiNome()+". Tem "+possuiIdade()+" anos, emite "+deveEmitirSom()+ " e "+getsobeEmArvores()+".");
	}
	

}
