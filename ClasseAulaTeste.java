import java.util.Scanner;
public class ClasseAulaTeste{
    public static void main(String[] args){
        ClasseAula minhaClasse;
	Scanner entrada = new Scanner(System.in);

	System.out.print("Insira o número de alunos da classe: ");
	int numAlunos = entrada.nextInt();

	System.out.print("Insira o número de cadeiras da classe: ");	
	int numCadeiras = entrada.nextInt();

        System.out.print("Insira a idade de cada aluno: ");
        int[] idades = new int[numAlunos];
	for(int i=0;i<numAlunos;i++) idades[i] = entrada.nextInt();

        minhaClasse = new ClasseAula(numAlunos, numCadeiras, idades);
	System.out.println(minhaClasse.getAlunos());
	System.out.println(minhaClasse.getCadeiras());
	System.out.println(minhaClasse.getMediaIdades());
    }
}
