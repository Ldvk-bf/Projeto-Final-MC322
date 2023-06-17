package unicamp.ic.mc322.model;

public class Produto {

	private Integer id;

	private String nome;

	private Integer quantidade;

	private Double preco;

	private Fornecedor fornecedor;
	
	public Produto(Integer idInteger, String nomeString, Integer quantidadeInteger, Double precoDouble, Fornecedor objFornecedor) {
		this.id = idInteger;
		this.nome = nomeString;
		this.quantidade = quantidadeInteger;
		this.preco = precoDouble;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
