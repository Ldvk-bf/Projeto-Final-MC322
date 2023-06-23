package unicamp.ic.mc322.model;


import java.util.ArrayList;
import unicamp.ic.mc322.util.Util;


public class Filial {

	private final Integer id ;

	private Funcionario Dono;

	private String nome;

	private String endereco;

	private ArrayList<Cliente> listaClientes;

	private ArrayList<Funcionario> listaFuncionarios;

	private ArrayList<Fornecedor> listaFornecedor;
	
	private ArrayList<Venda> listaVendas;

	private ArrayList<Produto> mostragem;

	private ArrayList<Produto> armazem;
	
	
	public Filial(Funcionario dono , String nome , String endereco) {
		this.Dono = dono;
		this.nome = nome;
		this.endereco = endereco;
		this.id = Util.criarId();
		listaClientes = new ArrayList<>();
		listaFuncionarios = new ArrayList<>();
		listaFornecedor = new ArrayList<>();
		mostragem = new ArrayList<>();
		armazem = new ArrayList<>();
		listaVendas = new ArrayList<>();
	}
	
	public Funcionario getDono() {
		return Dono;
	}

	public void setDono(Funcionario dono) {
		Dono = dono;
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


	public void setMostragem(ArrayList<Produto> mostragem) {
		this.mostragem = mostragem;
	}


	public void setArmazem(ArrayList<Produto> armazem) {
		this.armazem = armazem;
	}

	public Integer getId() {
		return id;
	}
	
	public void setListaVendas(ArrayList<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}


	//Adiciona um funcionário na lista de funcionários da filial
	public Boolean addFuncionario(Funcionario objFuncionario) {
		if(listaFuncionarios.contains(objFuncionario)) {
			return false;
		}
		else {
			listaFuncionarios.add(objFuncionario);
			return true;
		}
	}

	//Adiciona uma venda na lista de vendas da filial
	public Boolean gerarVenda(Venda venda) {
		if(listaVendas.contains(venda)) {
			return false;
		}
		else {
			listaVendas.add(venda);
			return true;
		}
	}
	
	//Retorna a lista de Funcionários da Filial
	public ArrayList<Funcionario> listarFuncionario() {
		return listaFuncionarios;
	}

	//Retorna a lista de Clientes da Filial
	public ArrayList<Cliente> listarClientes() {
		return listaClientes;
	}

	//Retorna a lista de Fornecedores da Filial
	public ArrayList<Fornecedor> listarFornecedores() {
		return listaFornecedor;
	}

	//Retorna a lista de Produtos da Filial
	public ArrayList<Produto> listarProdutos() {
		ArrayList <Produto> listProducts = new ArrayList<>();
		for(int i = 0; i < armazem.size();i++) {
			listProducts.add(armazem.get(i));
		}
		for(int i = 0; i < mostragem.size();i++) {
			listProducts.add(mostragem.get(i));
		}
		return listProducts;
	}

	//Retorna a lista de Produtos no Armazem
	public ArrayList<Produto> listarProdutosArmazem() {
		return armazem;
	}

	//Retorna a lista de Produtos na Mostragem
	public ArrayList<Produto> listarProdutosMostragem() {
		return mostragem;
	}

	//Retorna a lista de vendas da Filial
	public ArrayList<Venda> listarVendas() {
		return listaVendas;
	}

	//Retorna o Funcionário que mais vendeu no mês
	public Funcionario vendedorDoMes(String mes) {
		int somaVendas = 0;
		Funcionario funcOfMonth = null;
		for(int i = 0; i < listaFuncionarios.size();i++) {
			if(somaVendas < listaFuncionarios.get(i).vendasPorMes(mes).size()) {
				somaVendas = listaFuncionarios.get(i).vendasPorMes(mes).size();
				funcOfMonth = listaFuncionarios.get(i);
			}
		}
		return funcOfMonth;
	}
	
	//Gera o faturamento da Filial
	public Double gerarFaturamento() {
		double faturamento = 0.0;
		for(int k = 0; k < listaVendas.size();k++) {
			faturamento += listaVendas.get(k).calcPreco();
		}
		return faturamento;
	}

	//Gera o Faturamento mensal da Filial
	public Double gerarFaturamentoMensal(String mes) {
		double faturamento = 0.0;
		ArrayList <Venda> listVendas = new ArrayList<>();
		ArrayList <Venda> listVendasFinal = new ArrayList<>();
		for(int i = 0; i < listaFuncionarios.size();i++) {
			listVendas = listaFuncionarios.get(i).vendasPorMes(mes);
			for(int j = 0; j < listVendas.size();i++) {
				listVendasFinal.add(listVendas.get(j));
			}
		}
		for(int k = 0; k < listVendasFinal.size();k++) {
			faturamento += listVendasFinal.get(k).calcPreco();
		}
		return faturamento;
	}

	
	//Retorna o ClientePJ que mais comprou no mês
	public Cliente clientePremiadoCNPJ(String mes) {
		int somaVendas = 0;
		Cliente clienteDoMes = null;
		for(int i = 0; i < listaClientes.size();i++) {
			if(somaVendas < listaClientes.get(i).getListaCompras().size() 
			&& listaClientes.get(i).getClass() == ClientePJ.class) {
				somaVendas = listaClientes.get(i).getListaCompras().size();
				clienteDoMes  = listaClientes.get(i);
			}
		}
		return clienteDoMes;
	}
	
	//Retorna o ClientePF que mais comprou no mês
	public Cliente clientePremiadoCPF(String mes) {
		int somaVendas = 0;
		Cliente clienteDoMes = null;
		for(int i = 0; i < listaClientes.size();i++) {
			if(somaVendas < listaClientes.get(i).getListaCompras().size() 
			&& listaClientes.get(i).getClass() == ClientePF.class) {
				somaVendas = listaClientes.get(i).getListaCompras().size();
				clienteDoMes  = listaClientes.get(i);
			}
		}
		return clienteDoMes;
	}

	
}
