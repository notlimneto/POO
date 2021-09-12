public class Professor {
	private String nome;
	private String cpf;

	public Professor(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCPF: " + getCpf();
	}

	public String getNome(){
		return this.nome;
	}

	public String getCpf(){
		return this.cpf;
	}

	public double calcularSalario(){
		return 0;
	}
}
