package unicamp.ic.mc322.model;
import java.util.ArrayList;

abstract class Cliente {

	private final String cadastroPessoa;

	private String nome;

	private ArrayList<Venda> listaCompras;

	Cliente(String cadastroPessoa , String nome){
		this.cadastroPessoa = cadastroPessoa;
		this.nome = nome;
		listaCompras = new ArrayList<>();
	}

	public int qntdCompras() {
		return listaCompras.size();
	}


	public String getCadastroPessoa() {
		return cadastroPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Venda> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Venda> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public abstract double desconto();

}
