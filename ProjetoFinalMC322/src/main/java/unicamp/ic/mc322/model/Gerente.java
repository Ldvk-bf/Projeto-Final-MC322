package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

    public Gerente(String cpfString, String nomeString, String emailString,
            String telefoneString, String cargo, String senha, Filial objFilial) {
        super(cpfString, nomeString, emailString, telefoneString, cargo, senha, objFilial);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return listaFuncionario;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }

}
