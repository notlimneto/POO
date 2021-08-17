public class Aluno{
    String nome;
    String categoria;
    int[] notas;
    Aluno(String novoNome, String novaCategoria, int[] novasNotas){
        nome = novoNome;
	    categoria = novaCategoria;
        notas = new int[novasNotas.length];
        notas = novasNotas;
    }

    boolean relatorio(){
	    float media = getMedia();
	    if(categoria=="bolsista") return media>=75;
	    else return media>=70;
    }

    float getMedia(){
	    float total = 0;
	    for(int i=0;i<notas.length;i++) total +=notas[i];
	    return total/notas.length;
    }

    String getRelatorio(){
	    if(relatorio()) return "Regular";
	    else return "Desligado";
    }
}
