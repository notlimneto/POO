import java.util.Scanner;

public class algEuclides{

  public static int euclides(int num1, int num2){
    int maior = num1, menor = num2;
    if(num2 > num1){
      maior = num2; menor = num1;
    }
    int aux = menor;
    while(aux>0){
      menor = aux;
      aux = maior%aux;
      maior = menor;
    }
    return menor;
  }

  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int num1, num2;

    System.out.print("Insira o primeiro numero: ");
    num1 = entrada.nextInt();

    System.out.print("Insira o segundo numero: ");
    num2 = entrada.nextInt();

    System.out.println("O M.D.C destes numeros eh "+ euclides(num1, num2));
  }
}
