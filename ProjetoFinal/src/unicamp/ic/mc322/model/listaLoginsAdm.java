package unicamp.ic.mc322.model;
import java.util.ArrayList;


public class listaLoginsAdm {

    private ArrayList<Administrador> listaDeLoginsAdm;

    public listaLoginsAdm(){
        listaDeLoginsAdm  = new ArrayList<>();
    }

    public void novoLoginAdm(Administrador novo_adm){
        if(!listaDeLoginsAdm.contains(novo_adm)){
            listaDeLoginsAdm.add(novo_adm);
        }
    }

    public void excluirAdm(Administrador adm_exc){
        if(listaDeLoginsAdm.contains(adm_exc)){
            listaDeLoginsAdm.remove(adm_exc);
        }
    }

}
