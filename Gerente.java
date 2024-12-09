package atv;
public class Gerente extends FolhaPagamento{
	public Gerente() {
	}
	
	public Gerente(double sal) {
		this.setSalario(sal);
		this.setDesconto(650);
	}

	public double calculaSalarioLiquido(double Salario, double desconto){
		double SalarioLiquido = Salario-desconto;
		return SalarioLiquido+= (SalarioLiquido*0.01);
	}
	
}
