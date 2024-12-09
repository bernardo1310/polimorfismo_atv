package atv;
public abstract class FolhaPagamento {
	private double Salario;
	private double desconto;
	
	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public abstract double calculaSalarioLiquido(double Salario, double desconto);

}
