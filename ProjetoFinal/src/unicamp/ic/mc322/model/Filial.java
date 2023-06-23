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

	private ArrayList<Produto> mostragem;

	private ArrayList<Produto> armazem;
	
	private ArrayList<Venda> listaVendas;
	
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


	public Boolean addFuncionario(Funcionario objFuncionario) {
		if(listaFuncionarios.contains(objFuncionario)) {
			return false;
		}
		else {
			listaFuncionarios.add(objFuncionario);
			return true;
		}
	}

	public Boolean gerarVenda(Venda venda) {
		if(listaVendas.contains(venda)) {
			return false;
		}
		else {
			listaVendas.add(venda);
			return true;
		}
	}

	public ArrayList<Funcionario> listarFuncionario() {
		ArrayList <Funcionario> listFunc = new ArrayList<>();
		for(int i = 0; i < listaFuncionarios.size();i++) {
			listFunc.add(listaFuncionarios.get(i));
		}
		return listFunc;
	}

	public ArrayList<Cliente> listarClientes() {
		ArrayList <Cliente> listClients = new ArrayList<>();
		for(int i = 0; i < listaClientes.size();i++) {
			listClients.add(listaClientes.get(i));
		}
		return listClients;
	}

	public ArrayList<Fornecedor> listarFornecedores() {
		ArrayList <Fornecedor> listFornecedores = new ArrayList<>();
		for(int i = 0; i < listaFornecedor.size();i++) {
			listFornecedores.add(listaFornecedor.get(i));
		}
		return listFornecedores;
	}

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

	public ArrayList<Produto> listarProdutosArmazem() {
		ArrayList <Produto> listProductArmazem = new ArrayList<>();
		for(int i = 0; i < armazem.size();i++) {
			listProductArmazem.add(armazem.get(i));
		}
		return listProductArmazem;
	}

	public ArrayList<Produto> listarProdutosMostragem() {
		ArrayList <Produto> listProductMostragem = new ArrayList<>();
		for(int i = 0; i < mostragem.size();i++) {
			listProductMostragem.add(mostragem.get(i));
		}
		return listProductMostragem;
	}

	public ArrayList<Venda> listarVendas() {
		return listaVendas;
	}

	public Funcionario funcionarioDoMes(String mes) {
		int somaVendas = 0;
		Funcionario funcOfMonth = new Funcionario(null, null, null, null, null, null);
		for(int i = 0; i < listaFuncionarios.size();i++) {
			if(somaVendas < listaFuncionarios.get(i).vendasPorMes(mes).size()) {
				somaVendas = listaFuncionarios.get(i).vendasPorMes(mes).size();
				funcOfMonth = listaFuncionarios.get(i);
			}
		}
		return funcOfMonth;
	}

	public Double gerarFaturamento() {
		double faturamento = 0.0;
		for(int k = 0; k < listaVendas.size();k++) {
			faturamento += listaVendas.get(k).calcPreco();
		}
		return faturamento;
	}

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

	
	public Cliente clientePremiadoCPF(String mes) {
		int somaVendas = 0;
		Cliente clienteDoMes = new Cliente(null, null, null, null, null);
		for(int i = 0; i < listaClientes.size();i++) {
			if(somaVendas < listaClientes.get(i).getListaCompras().size()) {
				somaVendas = listaClientes.get(i).getListaCompras().size();
				clienteDoMes  = listaClientes.get(i);
			}
		}
		return clienteDoMes;
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

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public ArrayList<Fornecedor> getListaFornecedor() {
		return listaFornecedor;
	}

	public void setListaFornecedor(ArrayList<Fornecedor> listaFornecedor) {
		this.listaFornecedor = listaFornecedor;
	}

	public ArrayList<Produto> getMostragem() {
		return mostragem;
	}

	public void setMostragem(ArrayList<Produto> mostragem) {
		this.mostragem = mostragem;
	}

	public ArrayList<Produto> getArmazem() {
		return armazem;
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

}
