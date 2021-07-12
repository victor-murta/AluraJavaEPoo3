//herdando funcionnário
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        //super = referência da classe superior (classe mãe)
        return super.getSalario();
    }

}