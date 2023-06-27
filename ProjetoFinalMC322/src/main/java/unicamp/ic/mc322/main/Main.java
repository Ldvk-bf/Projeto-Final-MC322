package unicamp.ic.mc322.main;

import java.util.ArrayList;

import unicamp.ic.mc322.model.Empresa;
import unicamp.ic.mc322.model.Funcionario;
import unicamp.ic.mc322.model.Gerente;
import unicamp.ic.mc322.view.FrmLogin;

public class Main {

    static public ArrayList<Empresa> listaEmpresas = new ArrayList<>();

    static public ArrayList<Funcionario> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        usuarios.add(new Gerente("1", "root", null, null, null, "Administrador", "123", null, null));
        usuarios.add(new Gerente("26714270852", "func", null, null, null, "Gerente", "123", null, null));
        for (Empresa e : Main.listaEmpresas) {
            usuarios.addAll(e.listarFuncionarios());
        }

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
}
