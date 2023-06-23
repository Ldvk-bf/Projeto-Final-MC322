package unicamp.ic.mc322.model;

import java.util.ArrayList;

public class AdmEstoque extends Funcionario {

    private ArrayList<Produto> listaCompras = new ArrayList<>();

    public AdmEstoque(String cpfString, String nomeString, String emailString,
            String telefoneString, String enderecoString, Filial objFilial) {
        super(cpfString, nomeString, emailString, telefoneString, enderecoString, objFilial);
    }

    public ArrayList<Produto> listarCompras() {
        return listaCompras;
    }

    @Override
    public Double pontuacao() {
        throw new UnsupportedOperationException("Unimplemented method 'pontuacao'");
    }
}
