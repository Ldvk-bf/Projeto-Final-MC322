package unicamp.ic.mc322.model;
import java.time.LocalDate;

public class ClientePF extends Cliente{
    private String email;

	private String telefone;

	private String endereco;

    private LocalDate dataNascimento;

    ClientePF(String cadastroPessoa , String nome , String email , String telefone , String endereco , LocalDate dataNascimento){
        super(cadastroPessoa, nome);
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
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

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public double desconto(){
        if(5 <= super.qntdCompras && super.qntdCompras< 15){
            return Desconto.varejo.getPorcentagem() + Desconto.fator_5_15.getPorcentagem();
        }
        else if (15 <= super.qntdCompras && super.qntdCompras< 20){
            return Desconto.varejo.getPorcentagem() + Desconto.fator_15_20.getPorcentagem();
        }
        else if (20 <= super.qntdCompras){
            return Desconto.varejo.getPorcentagem() + Desconto.fator_20.getPorcentagem();
        }
        else{
            return Desconto.varejo.getPorcentagem();
        }
    }


}
