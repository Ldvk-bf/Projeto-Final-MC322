package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Venda> listaFuncionario = new ArrayList<>();

    public Gerente(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, Filial objFilial,
            ArrayList<Venda> listaFuncionario) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, objFilial);
    }

    public Gerente(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, Filial objFilial) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, objFilial);
    }

    public ArrayList<Venda> listarFuncionario() {
        return listaFuncionario;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }

}
