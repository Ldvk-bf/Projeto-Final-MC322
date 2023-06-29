package unicamp.ic.mc322.model;

import java.util.ArrayList;
import unicamp.ic.mc322.util.Util;

public class Filial {

	private final Integer id;

	private String nome;

	private String endereco;

	private ArrayList<Cliente> listaClientes;

	private ArrayList<Funcionario> listaFuncionarios;

	private ArrayList<Fornecedor> listaFornecedor;

	private ArrayList<Venda> listaVendas;

	private ArrayList<Produto> listaProdutos;

	public Filial(Funcionario dono, String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.id = Util.criarId();
		listaClientes = new ArrayList<>();
		listaFuncionarios = new ArrayList<>();
		listaFornecedor = new ArrayList<>();
		listaProdutos = new ArrayList<>();
		listaVendas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public void setListaFornecedor(ArrayList<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}

	public void setlistaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Integer getId() {
		return id;
	}

	public void setListaVendas(ArrayList<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}

	// Adiciona um funcionário na lista de funcionários da filial
	public Boolean addFuncionario(Funcionario objFuncionario) {
		if (listaFuncionarios.contains(objFuncionario)) {
			return false;
		} else {
			listaFuncionarios.add(objFuncionario);
			return true;
		}
	}

	// Retorna a lista de Funcionários da Filial
	public ArrayList<Funcionario> listarFuncionario() {
		return listaFuncionarios;
	}

	// Retorna a lista de Clientes da Filial
	public ArrayList<Cliente> listarClientes() {
		return listaClientes;
	}

	// Retorna a lista de Fornecedores da Filial
	public ArrayList<Fornecedor> listarFornecedores() {
		return listaFornecedor;
	}

	// Retorna a lista de Produtos da Filial
	public ArrayList<Produto> listarProdutos() {
		ArrayList<Produto> listProducts = new ArrayList<>();
		for (int i = 0; i < listaProdutos.size(); i++) {
			listProducts.add(listaProdutos.get(i));
		}
		return listProducts;
	}

	// Retorna a lista de Produtos na listaProdutos
	public ArrayList<Produto> listarProdutoslistaProdutos() {
		return listaProdutos;
	}

	// Retorna a lista de vendas da Filial
	public ArrayList<Venda> listarVendas() {
		return listaVendas;
	}

	// Retorna o Funcionário que mais vendeu no mês
	public Funcionario vendedorDoMes(String mes) {
		int somaVendas = 0;
		Funcionario funcOfMonth = null;
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			if (somaVendas < listaFuncionarios.get(i).vendasPorMes(mes).size()) {
				somaVendas = listaFuncionarios.get(i).vendasPorMes(mes).size();
				funcOfMonth = listaFuncionarios.get(i);
			}
		}
		return funcOfMonth;
	}

	// Gera o faturamento da Filial
	public Double gerarFaturamento() {
		double faturamento = 0.0;
		for (int k = 0; k < listaVendas.size(); k++) {
			faturamento += listaVendas.get(k).calcPreco();
		}
		return faturamento;
	}

	// Gera o Faturamento mensal da Filial
	public Double gerarFaturamentoMensal(String mes) {
		double faturamento = 0.0;
		ArrayList<Venda> listVendas = new ArrayList<>();
		ArrayList<Venda> listVendasFinal = new ArrayList<>();
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			listVendas = listaFuncionarios.get(i).vendasPorMes(mes);
			for (int j = 0; j < listVendas.size(); i++) {
				listVendasFinal.add(listVendas.get(j));
			}
		}
		for (int k = 0; k < listVendasFinal.size(); k++) {
			faturamento += listVendasFinal.get(k).calcPreco();
		}
		return faturamento;
	}

	// Retorna o ClientePJ que mais comprou no mês
	public Cliente clientePremiadoCNPJ(String mes) {
		int somaVendas = 0;
		Cliente clienteDoMes = null;
		for (int i = 0; i < listaClientes.size(); i++) {
			if (somaVendas < listaClientes.get(i).getListaCompras().size()
					&& listaClientes.get(i).getClass() == ClientePJ.class) {
				somaVendas = listaClientes.get(i).getListaCompras().size();
				clienteDoMes = listaClientes.get(i);
			}
		}
		return clienteDoMes;
	}

	// Retorna o ClientePF que mais comprou no mês
	public Cliente clientePremiadoCPF(String mes) {
		int somaVendas = 0;
		Cliente clienteDoMes = null;
		for (int i = 0; i < listaClientes.size(); i++) {
			if (somaVendas < listaClientes.get(i).getListaCompras().size()
					&& listaClientes.get(i).getClass() == ClientePF.class) {
				somaVendas = listaClientes.get(i).getListaCompras().size();
				clienteDoMes = listaClientes.get(i);
			}
		}
		return clienteDoMes;
	}

	public Produto produtoMaisVendido(){

		Produto produto = null;
		int qntVendas = 0;

		for (Venda venda_aux : listarVendas()){
			//itera em todas as vendas e encontra o produto que foi mais comprado
			for(Produto produto_aux : venda_aux.getListaProdutos()){
				if(produto_aux.getQuantidade() > qntVendas){
					produto = produto_aux;
				}
			}
		}
		return produto;
	}

	public int quantidadeDisponivelProduto(Produto produto){
		//informa a quantidade de produtos disponiveis
		int quantidade = 0;
		
		for(Produto produto_aux : this.listarProdutos()){
			if(produto_aux.equals(produto)){
				quantidade += produto_aux.getQuantidade();
			}
		}

		return quantidade;
	}
	
	public String cpfFunc() {
		String info = "";
		if(listaFuncionarios.size()>1) {
			for(int i = 0 ; i < listaFuncionarios.size()-1;i++) {
				info += listaFuncionarios.get(i).getCpf() + "*";
			}
			info += listaFuncionarios.get(listaFuncionarios.size()-1).getCpf();
		}
		else if(listaFuncionarios.size() == 1) {
			info += listaFuncionarios.get(0).getCpf();
		}
		return info;
	}
	
	public String cnpjForn() {
		String info = "";
		if( listaFornecedor.size()>1) {
			for(int i = 0 ; i < listaFornecedor.size()-1;i++) {
				info += listaFornecedor.get(i).getCnpj() + "*";
			}
			info += listaFornecedor.get(listaFornecedor.size()-1).getCnpj();
		}
		else if(listaFornecedor.size() == 1) {
			info += listaFornecedor.get(0).getCnpj();
		}
		return info;
	}
	
	public String infoProduct() {
		String info = "";
		if( listaProdutos.size()>1) {
			for(int i = 0 ; i < listaProdutos.size()-1;i++) {
				info += listaProdutos.get(i).getNome() + "-";
			}
			info += listaProdutos.get(listaProdutos.size()-1).getNome();
		}
		else if(listaProdutos.size() == 1) {
			info += listaProdutos.get(0).getNome();
		}
		return info;
	}
	
	public String infoVenda() {
		String info = "";
		if( listaVendas.size()>1) {
			for(int i = 0 ; i < listaVendas.size()-1;i++) {
				info += listaVendas.get(i).getId() + "-";
			}
			info += listaVendas.get(listaVendas.size()-1).getId();
		}
		else if(listaVendas.size() == 1) {
			info += listaVendas.get(0).getId();
		}
		return info;
	}
	
	
	
	
	
	public String toString() {
		String dados =  id + "," + nome + "," + endereco + "," + cpfFunc() + "," 
		+ cnpjForn() + "," +  infoProduct() + "," + infoVenda() + "\n";
		return dados;
	}


	
}


