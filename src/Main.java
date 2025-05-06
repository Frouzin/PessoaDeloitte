public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marcos", 21);
        Pessoa pessoa2 = new Pessoa("Antonio", 22);

        if(pessoa.idade>pessoa2.idade){
            System.out.println(pessoa.nome + " é mais velho que " + pessoa2.nome);
        }
        else {
            System.out.println(pessoa2.nome + " é mais velho que " + pessoa.nome);
        }
    }
}
