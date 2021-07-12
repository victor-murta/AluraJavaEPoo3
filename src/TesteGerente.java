public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Jassa");
        g1.setCpf("82763-2");
        g1.setSalario(6278.0);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        boolean autenticou = g1.autentica(1234);
        System.out.println(autenticou);



        System.out.println(g1.getBonificacao());


    }
}
