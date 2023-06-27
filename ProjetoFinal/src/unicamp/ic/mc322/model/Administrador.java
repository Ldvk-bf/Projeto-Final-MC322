package unicamp.ic.mc322.model;

public class Administrador {
    
    private final String login;
    private String senha;

    public Administrador(String CPF, String senha){
        //usado na hora de cadastrar
        this.login = CPF;
        this.senha = senha;
    }

    public String getCPF(){
        return this.login;
    }

    public String getSenha(){
        return this.senha;
    }

    public void alterarSenha(String senhaNova){
        this.senha = senhaNova;
    }

}
