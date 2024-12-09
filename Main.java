package atv;

public class Main {

	public static void main(String[] args) {
		Estagiario estagiario = new Estagiario(1500);
		Desenvolvedor desenvolvedor = new Desenvolvedor(3500);
		Analista analista = new Analista(6300);
		Gerente gerente = new Gerente(14000);
		
		FolhaPagamento[] folhapag = new FolhaPagamento[4];
		folhapag[0] = estagiario;
		folhapag[1] = desenvolvedor;
		folhapag[2] = analista;
		folhapag[3] = gerente;
		
		for(int i=0;i<4;i++) {
			System.out.println(folhapag[i].calculaSalarioLiquido(folhapag[i].getSalario(), folhapag[i].getDesconto()));
		}

	}

}
