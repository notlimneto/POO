import java.util.Scanner;

public class TesteCarro{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		float[] precoAcessorio = {1500.00f, 850.00f, 200.00f};

		System.out.print("Digite o modelo do carro (Up/Voyage/Virtus): ");
		String modelo = entrada.nextLine();

		System.out.print("Entre com a quantidade de acessórios desejados: ");
		int numAcessorios = entrada.nextInt();

		Carro meuCarro = new Carro(modelo);
		for(int i=0;i<numAcessorios;i++){
			System.out.printf("Insira o código do %dº acessório desejado (0: banco de couro, 1: som, 2: insulfilm): ", i);
			int codigo = entrada.nextInt();

			meuCarro.insereAcessorio(codigo);
		}

		System.out.println("############### NOTA FISCAL ###############");
		System.out.printf("Carro: %s\n", meuCarro.getModelo());
		float soma = 0.00f;

		for(int i=0;i<meuCarro.getTamAcessorios();i++){
			soma+=precoAcessorio[meuCarro.getAcessorio(i)];
		}
		System.out.printf("Preço dos Acessórios = %.2f\n", soma);
		entrada = null; meuCarro = null;
	}
}



