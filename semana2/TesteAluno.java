import java.util.Scanner;
public class TesteAluno{
  public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o nome do aluno: ");
  String nome = entrada.nextLine();

	System.out.print("Insira a categoria do aluno (bolsista/não bolsista): ");
	String categoria = entrada.nextLine();

	System.out.print("Entre com a quantidade de disciplinas cursadas: ");
	int disciplinas = entrada.nextInt();

	int[] notas = new int[disciplinas];
	for(int i=0;i<disciplinas;i++){
	  System.out.printf("Insira a nota na disciplina %d: ", i+1);
	  notas[i] = entrada.nextInt();
	}
        
	Aluno aluno = new Aluno(nome, categoria, notas);
	System.out.printf("############# RELATÓRIO FINAL #############%nCoeficiente de Rendimento: %.2f%nSituação final: %s%n", aluno.getMedia(), aluno.getRelatorio());
    
  }
}


