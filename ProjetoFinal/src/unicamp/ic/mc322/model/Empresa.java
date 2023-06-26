package unicamp.ic.mc322.model;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {

	private String cnpj;

	private String nome;

	private Funcionario Dono;

	private ArrayList<Filial> listaFiliais;

	private Collection<Filial> filial;

	public Boolean criarFilial(Filial objFilial) {
		boolean flag = false;

		if (!listaFiliais.contains(objFilial)) {
			listaFiliais.add(objFilial);
			flag = true;
		}
		return flag;// retorna falso caso ja exista uma filial na lista
	}

	public boolean excluirFilial(Filial objFilial) {
		boolean flag = false;

		if (listaFiliais.contains(objFilial)) {
			listaFiliais.remove(objFilial);
			flag = true;
		}
		return flag;// retorna falso caso nao exista uma filial na lista
	}

	public ArrayList<Cliente> listarClientes() {

		ArrayList<Cliente> listadeClient = new ArrayList<>();
		for (Filial filial : this.listaFiliais) {
			listadeClient.addAll(filial.listarClientes());
		}
		return listadeClient;
	}

	public ArrayList<Filial> listarFiliais() {
		return listaFiliais;
	}

	public ArrayList<Funcionario> listarFuncionarios() {
		// cria uma mega lista com todos os funcionarios de cada filial
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
		for (Filial filial : this.listaFiliais) {
			listaFuncionarios.addAll(filial.listarFuncionario());
		}
		return listaFuncionarios;
	}

	public ArrayList<Venda> listarVendas() {
		// cria uma mega lista com todas as vendas de cada filial
		ArrayList<Venda> listaVendas = new ArrayList<>();
		for (Filial filial : this.listaFiliais) {
			listaVendas.addAll(filial.listarVendas());
		}
		return listaVendas;
	}

	public ArrayList<Fornecedor> listarFornecedores() {
		ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
		for (Filial filial : this.listaFiliais) {
			listaFornecedores.addAll(filial.listarFornecedores());
		}
		return listaFornecedores;
	}

	public ArrayList<Produto> listarProdutos() {

		ArrayList<Produto> listaProdutos = new ArrayList<>();
		for (Filial filial : this.listaFiliais) {
			listaProdutos.addAll(filial.listarProdutos());
		}
		return listaProdutos;

	}

	public Double gerarFaturamento() {

		Double faturamento = 0.0;

		for (Filial filial : this.listaFiliais) {
			faturamento += filial.gerarFaturamento();
		}
		return faturamento;
	}

	public Double gerarFaturarmentoMensal(String mes) {

		Double faturamentoMensal = 0.0;

		for (Filial filial : this.listaFiliais) {
			faturamentoMensal += filial.gerarFaturamentoMensal(mes);
		}
		return faturamentoMensal;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Filial> getListaFiliais() {
		return listaFiliais;
	}

	public void setListaFiliais(ArrayList<Filial> listaFiliais) {
		this.listaFiliais = listaFiliais;
	}
}
