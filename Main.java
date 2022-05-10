class Main {
 public static void main(String[] args) {
		GerenciadorImpressao g1 = GerenciadorImpressao.GetInstance();
		g1.setNome("nome 1");
		System.out.println("G1 = "+g1.getNome());
		GerenciadorImpressao g2 = GerenciadorImpressao.GetInstance();
		System.out.println("G2 = "+g2.getNome());
		GerenciadorImpressao g3 = GerenciadorImpressao.GetInstance();
		System.out.println("G3 = "+g3.getNome());

		System.out.println(" ## TROCANDO NOME DO G3 somente ");
		//alterando nome do g3
		g3.setNome("nome 3");
		System.out.println("G1 = "+g1.getNome());
		System.out.println("G2 = "+g2.getNome());
		System.out.println("G3 = "+g3.getNome());
	}
}