public class Main {

    public static void main(String[] args) {
        // Criando objeto do tipo Pessoa
        var male = new Pessoa(); // instância de Pessoa
        male.setNome("João");    // agora o setter é chamado como MÉTODO
        male.setIdade(30);

        var female = new Pessoa();
        female.setNome("Maria");
        female.setIdade(25);

        // Saída de dados usando getters
        System.out.println("Male nome: " + male.getNome() + " idade: " + male.getIdade());
        System.out.println("Female nome: " + female.getNome() + " idade: " + female.getIdade());

        // Usando método extra (polimorfismo básico)
        System.out.println("Apresentação male -> " + male.apresentar());
        System.out.println("Apresentação female -> " + female.apresentar());
    }
}
