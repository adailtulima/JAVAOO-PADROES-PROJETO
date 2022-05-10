public class GerenciadorImpressao {
	
	private String nome;
	public void setNome(String novoNome){
		this.nome= novoNome;	
	}
	public String getNome(){
		return this.nome;
	}
	private	static GerenciadorImpressao instanciaUnica;
	
	private GerenciadorImpressao() {}

	public static GerenciadorImpressao GetInstance() {
		if(instanciaUnica==null)
			instanciaUnica = new GerenciadorImpressao();
		return instanciaUnica;
	}

    

}



