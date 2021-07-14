public abstract interface Autenticavel {
    //clsses abstratas não pode ter nada concreto (atributos, implementações
    // interface é uma classe abstrata com todos os métodos abstratos
    // private int senha;

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha) ;
}
