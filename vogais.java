import java.util.Scanner;

public class vogais{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int qtd;

    String frase;
    String[] palavras;

    qtd = entrada.nextInt();
    entrada.nextLine();

    frase = entrada.nextLine();
    String palavraMaior = new String();

    
    palavras = new String[qtd];
    palavras = frase.split(" ");

    int vogaisMaior = 0;
    int numVogais = 0;
    for(int i=0;i<qtd;i++){
      for(int j=0; j<palavras[i].length(); j++){
        if(palavras[i].substring(j,j+1)=="a"||palavras[i].substring(j,j+1)=="e"||palavras[i].substring(j,j+1)=="i"||palavras[i].substring(j,j+1)=="o"||palavras[i].substring(j,j+1)=="u") numVogais++;
      }
      if(numVogais>vogaisMaior){
        palavraMaior = palavras[i];
        vogaisMaior = numVogais;
      }
      numVogais=0;
    }
    System.out.println(palavraMaior + vogaisMaior);
  }
}
