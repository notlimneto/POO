import java.util.*;
public class Departamento {
	private String nome;
	private String faculdade;
	private ArrayList<Professor> professores = new ArrayList<Professor>();

	public Departamento(String nome, String faculdade){
		this.nome = nome;
		this.faculdade = faculdade;
	}

	public void gerarFolhaDePagamento() {
		for(Professor p : professores) {
			System.out.println(p);
			System.out.printf("Salário = R$ %.2f \n",p.calcularSalario());
			System.out.println();
		}
	}

	public void contratarProfessor(Professor... professores){
		for(Professor aux : professores){
			this.professores.add(aux);
		}
	}

	public String getNome(){
		return this.nome;
	}
}
