// A classe Pessoa representa um modelo (objeto do mundo real)
public class Pessoa {

    // ATRIBUTOS (privados -> encapsulamento)
    private String nome; 
    private int idade;

    // GETTER e SETTER para o atributo nome
    // Getter -> obtém o valor
    public String getNome() {
        return nome;
    }

    // Setter -> altera o valor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // GETTER e SETTER para o atributo idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        // Boa prática: regra de validação (não aceitar idades negativas)
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida! Definindo como 0.");
            this.idade = 0;
        }
    }
    
    // Método extra (ainda não visto, mas útil): apresentar()
    public String apresentar() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
