package unicamp.ic.mc322.model;

import java.util.ArrayList;

public abstract class Funcionario {

	private final String cpf;

	private String nome;

	private String email;

	private String telefone;

	private String endereco;

	private Filial filial;

	private ArrayList<Venda> listaVendas;

	public Funcionario(String cpfString, String nomeString, String emailString,
			String telefoneString, String enderecoString, Filial objFilial) {
		this.cpf = cpfString;
		this.nome = nomeString;
		this.email = emailString;
		this.telefone = telefoneString;
		this.endereco = enderecoString;
		this.filial = objFilial;
	}

	public abstract Double pontuacao();

	public ArrayList<Venda> vendasPorMes(String mes) {
		return null;
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

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}

	public void setListaVendas(ArrayList<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}

	public String getCpf() {
		return cpf;
	}

}
