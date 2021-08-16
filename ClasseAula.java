public class ClasseAula{
    int alunos;
    int cadeiras;
    float mediaIdade;

    ClasseAula(int numAlunos, int numCadeiras, int[] todasIdades){
        alunos = numAlunos;
	cadeiras = numCadeiras;
	mediaIdade = mediaIdades(todasIdades, alunos);
    }

    float mediaIdades(int[] todasIdades, int alunos){
	int soma = 0;
	for(int i=0;i<alunos;i++) soma+=todasIdades[i];
	return soma/alunos;
    }
    int getAlunos(){ return alunos;}
    int getCadeiras(){ return cadeiras;}
    float getMediaIdades(){ return mediaIdade;}
}
