package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class Vendedor extends Funcionario {

    private ArrayList<Venda> listaVendas = new ArrayList<>();

    public Vendedor(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, String senha, Filial objFilial) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, senha, objFilial);
    }

    public ArrayList<Venda> listarVendas() {
        return listaVendas;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }
}
