public class SistemaInterno {
    private int senha = 222;

    public void autentica(Autenticavel g){
        boolean autenticou = g.autentica(this.senha);

        if(autenticou){
            System.out.println("Gerente autenticado!!");
        }else{
            System.out.println("Acesso negado!!");
        }
    }


}
