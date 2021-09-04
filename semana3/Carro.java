import java.util.ArrayList;

public class Carro{
	private String modelo;
	private ArrayList<Integer> acessorios = new ArrayList<Integer>();

	Carro(String modeloCarro){
		modelo = modeloCarro;
	}

	public String getModelo(){
		return modelo;
	}

	public int getTamAcessorios(){
		return acessorios.size();
	}

	public int getAcessorio(int index){
		return acessorios.get(index);
	}

	public void insereAcessorio(int codigo){
		acessorios.add(codigo);
	}
}
