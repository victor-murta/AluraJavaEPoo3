public class TestaSistema {

    public static void main(String[] args){
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(223);

        Designer d = new Designer();

        Cliente c = new Cliente();
        c.setSenha(222);


        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);

    }
}
