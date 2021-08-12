import java.util.Scanner;

public class investimento{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double investPedro, investJoao;

    investJoao = entrada.nextDouble();
    investPedro = entrada.nextDouble();

    int meses = 0;

    while(investJoao <= investPedro){
      meses++;
      investPedro += investPedro/200;
      investJoao += investJoao/40;
    }

    System.out.println(meses);
  }
}
