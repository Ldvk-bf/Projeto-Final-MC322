package unicamp.ic.mc322.main;

import unicamp.ic.mc322.model.listaLoginsAdm;
import unicamp.ic.mc322.view.Frmmenu;

public class Main {
    public static void main(String[] args) {


        listaLoginsAdm listaLoginsAdm = new listaLoginsAdm();
        System.out.println("Ludivk");
        Frmmenu menuObj = new Frmmenu("Ludivik", "Gerente");
        menuObj.setVisible(true);
    }
}
