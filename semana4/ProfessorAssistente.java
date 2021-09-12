public class ProfessorAssistente extends Professor{
	private int horasTrabalhadasSemana;
	private double gratificacaoAtividadeExtra;

	public ProfessorAssistente(String nome, String cpf, int horasTrabalhadas, double gratificacao){
		super(nome, cpf);
		this.horasTrabalhadasSemana = horasTrabalhadas;
		this.gratificacaoAtividadeExtra = gratificacao;		
	}

	public double getGratificacaoAtividadeExtra(){
		return this.gratificacaoAtividadeExtra;
	}

	public int getHorasTrabalhadasSemana(){
		return this.horasTrabalhadasSemana;
	}
	
	@Override
	public double calcularSalario(){
		return 100*this.horasTrabalhadasSemana + this.gratificacaoAtividadeExtra;
	}
}	
