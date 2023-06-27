package unicamp.ic.mc322.main;

import java.util.ArrayList;

import unicamp.ic.mc322.model.Empresa;
import unicamp.ic.mc322.model.Funcionario;
import unicamp.ic.mc322.model.Gerente;
import unicamp.ic.mc322.view.FrmLogin;
import unicamp.ic.mc322.view.cadastro.FrmCadastroFuncionario;

public class Main {

    static public ArrayList<Empresa> listaEmpresas = new ArrayList<>();

    static public ArrayList<Funcionario> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFuncionario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFuncionario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFuncionario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFuncionario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        usuarios.add(new Gerente("1", "root", null, null, "Administrador", "123", null));
        usuarios.add(new Gerente("26714270852", "func", null, null, "Gerente", "123", null));
        for (Empresa e : Main.listaEmpresas) {
            usuarios.addAll(e.listarFuncionarios());
        }

        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
}
