import java.util.Scanner;

public class vendedor{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int produto, quantidade;
    double bruto = 0;


    System.out.print("Insira o codigo do produto: ");
    produto = entrada.nextInt();

    System.out.print("Insira a quantidade: ");
    quantidade = entrada.nextInt();

    if(produto>0 && produto<11){
      bruto = 10 * quantidade;
      System.out.println(10);
      System.out.println(bruto);

    }else if(produto<21){
      bruto = 15 * quantidade;
      System.out.println(15);
      System.out.println(bruto);

    }else if(produto<31){
      bruto = 20 * quantidade;
      System.out.println(20);
      System.out.println(bruto);

    }else if(produto<40){
      bruto = 30 * quantidade;
      System.out.println(40);
      System.out.println(bruto);

    }
    
    double compra;

    if(bruto<250){
      double desconto = bruto / 20;
      compra = bruto - desconto;
      System.out.println(desconto);
    }else if(bruto<501){
      double desconto = bruto / 10;
      compra = bruto - desconto;
      System.out.println(desconto);
    }else{
      double desconto = (15 * bruto) / 100;
      compra = bruto - desconto;
      System.out.println(desconto);
    }

    System.out.println(compra);
  }
}
