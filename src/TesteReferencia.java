public class TesteReferencia {
    public static void main(String[] args){
        // nem todo funcionário é um gerente
        // g1 é do tipo Funcionario = polimorfismo
        //Funcionario g1 = new Gerente();

        Gerente g = new Gerente();
        g.setNome("Gerente 1");
        g.setSalario(5000.0);

        Funcionario f = new Funcionario();
        f.setSalario(1000);

        EditorVideo e = new EditorVideo();
        e.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g);
        controle.registra(f);
        controle.registra(e);


        System.out.println(controle.getSoma());
    }
}
