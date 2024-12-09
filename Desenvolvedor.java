package atv;
public class Desenvolvedor extends FolhaPagamento{
	public Desenvolvedor() {
	}
	
	public Desenvolvedor(double sal) {
		this.setSalario(sal);
		this.setDesconto(650);
	}

	public double calculaSalarioLiquido(double Salario, double desconto){
		double SalarioLiquido = Salario-desconto;
		return SalarioLiquido+= (SalarioLiquido*0.1);
	}
}
