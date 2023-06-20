package unicamp.ic.mc322.model;


import java.util.ArrayList;

public class Cliente {

	private String cadastroPessoa;

	private String nome;

	private String email;

	private String telefone;

	private String endereco;

	private ArrayList<Venda> listaCompras;
	
	public Cliente(String cadastroPessoa, String nome, String email, String telefone, String endereco) {
		this.cadastroPessoa = cadastroPessoa;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco  = endereco;
	}

	public Double gastoTotal() {
		return null;
	}

	public String getCadastroPessoa() {
		return cadastroPessoa;
	}

	public void setCadastroPessoa(String cadastroPessoa) {
		this.cadastroPessoa = cadastroPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Venda> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Venda> listaCompras) {
		this.listaCompras = listaCompras;
	}

}
