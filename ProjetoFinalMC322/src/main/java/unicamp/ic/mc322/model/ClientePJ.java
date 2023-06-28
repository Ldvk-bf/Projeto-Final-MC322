package unicamp.ic.mc322.model;

import java.time.LocalDate;

public class ClientePJ extends Cliente {

    private LocalDate dataFundacao;

    private Integer qntFuncionarios;

    public ClientePJ(String cadastroPessoa, String nome, LocalDate dataFundacao, Integer qntFuncionarios) {
        super(cadastroPessoa, nome);
        this.dataFundacao = dataFundacao;
        this.qntFuncionarios = qntFuncionarios;
    }

    @Override
    public double desconto() {
        if (5 <= qntdCompras() && qntdCompras() < 15) {
            return Desconto.atacado.getPorcentagem() + Desconto.fator_5_15.getPorcentagem();
        } else if (15 <= qntdCompras() && super.qntdCompras() < 20) {
            return Desconto.atacado.getPorcentagem() + Desconto.fator_15_20.getPorcentagem();
        } else if (20 <= qntdCompras()) {
            return Desconto.atacado.getPorcentagem() + Desconto.fator_20.getPorcentagem();
        } else {
            return Desconto.atacado.getPorcentagem();
        }
    }

    public Integer getQntFuncionarios() {
        return qntFuncionarios;
    }

    public void setQntFuncionarios(Integer qntFuncionarios) {
        this.qntFuncionarios = qntFuncionarios;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setTelefone(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

}
