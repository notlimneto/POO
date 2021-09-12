public class ProfessorAdjunto extends Professor{
	private double gratificacaoTitulacao;
	private double salarioBase;

	public ProfessorAdjunto(String nome, String cpf, double gratificacao, double salario){
		super(nome, cpf);
		this.gratificacaoTitulacao = gratificacao;
		this.salarioBase = salario;
	}

	public double getGratificacaoTitulacao(){
		return this.gratificacaoTitulacao;
	}

	public double getSalarioBase(){
		return this.salarioBase;
	}
	
	@Override
	public double calcularSalario(){
		return (this.gratificacaoTitulacao+this.salarioBase)*1.3;
	}	
}
