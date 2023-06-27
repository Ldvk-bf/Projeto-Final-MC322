package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

    public Gerente(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, String cargo, String senha, Filial objFilial,
            ArrayList<Funcionario> listaFuncionario) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, cargo, senha, objFilial);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return listaFuncionario;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }

}
