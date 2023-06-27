package unicamp.ic.mc322.model;

import java.time.LocalDate;
import java.util.ArrayList;
import unicamp.ic.mc322.util.Util;

public class Venda {

	private final Integer id;

	private ArrayList<Produto> listaProdutos;

	private Funcionario atendente;

        private String formaPagamento;

	private LocalDate data;

	private Cliente cliente;

	private Filial filial;

	Venda(Funcionario atendente, LocalDate data, String formaPagamento, Cliente cliente, Filial filial) {
		id = Util.criarId();
		this.atendente = atendente;
		this.data = data;
		this.cliente = cliente;
		listaProdutos = new ArrayList<>();
		this.filial = filial;
                this.formaPagamento = formaPagamento;
	}

	public Double calcPreco() {
		double preco = 0;
		for (int k = 0; k < listaProdutos.size(); k++) {
			preco += listaProdutos.get(k).getPrecoVenda();
		}
		preco = preco - preco * cliente.desconto();
		return preco;
	}

	public Integer getId() {
		return id;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Funcionario getAtendente() {
		return atendente;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getListaProduto() {
		return listaProdutos;
	}

	public void setProduto(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
