//herdando funcionário
public class Gerente extends Funcionario implements Autenticavel {
    // extends Autenticavel , Funcionario: não funciona no Java (fazer esse tipo de extend)

    private int senha ;

    public double getBonificacao() {
        //super = referência da classe superior (classe mãe)
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha){

    }

    @Override
    public boolean autentica(int senha){
        return this.senha == senha;
    }

}