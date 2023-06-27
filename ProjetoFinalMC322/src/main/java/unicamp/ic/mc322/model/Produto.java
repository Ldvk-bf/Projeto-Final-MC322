package unicamp.ic.mc322.model;

public class Produto {

	private Integer id;

	private String nome;

	private Integer quantidade;

	private Double precoVenda;

	private Double precoCompra;

	private Fornecedor fornecedor;
	
	public Produto(Integer idInteger, String nomeString, Integer quantidadeInteger, Double precoVenda, Double precoCompra, Fornecedor objFornecedor) {
		this.id = idInteger;
		this.nome = nomeString;
		this.quantidade = quantidadeInteger;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
		this.fornecedor = objFornecedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public Double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoVenda(Double preco) {
		this.precoVenda = preco;
	}

	public void setprecoCompra(Double preco) {
		this.precoVenda = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
