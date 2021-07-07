public class testeFuncionario {

    public static void main(String[] args){
        Funcionario victor = new Funcionario();

        victor.setNome("Victor");
        victor.setCpf("1234352-2");
        victor.setSalario(1000);


        System.out.println(victor.getNome());
    }
}
