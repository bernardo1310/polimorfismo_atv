package atv;
public class Estagiario extends FolhaPagamento{
	public Estagiario() {
	}
	
	public Estagiario(double sal) {
		this.setSalario(sal);
		this.setDesconto(650);
	}

	public double calculaSalarioLiquido(double Salario, double desconto){
		double SalarioLiquido = Salario-desconto;
		return SalarioLiquido+= (SalarioLiquido*0.2);
	}
}
