public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marco", 22);
        Pessoa pessoa2 = new Pessoa("Antonio", 22);

        Produto produto = new Produto(cama,100);
        double percentual = 10;
        double aplicarDesconto = produto.aplicarDesconto(percentual);

        if(pessoa.idade>pessoa2.idade){
            System.out.println(pessoa.nome + " é mais velho que " + pessoa2.nome);
        }
        else if (pessoa.idade == pessoa2.idade) {
            System.out.println(pessoa2.nome + " tem a mesma idade que " + pessoa.nome);
        }
        else{
            System.out.println(pessoa2.nome + " é mais velho que " + pessoa.nome);
        }

        if (pessoa.isMaiorDeIdade()){
            System.out.println(pessoa.nome + " é de maior");
        }
        else{
            System.out.println(pessoa.nome + " não é de maior");
        }

        if (pessoa2.isMaiorDeIdade()){
            System.out.println(pessoa2.nome + " é de maior");
        }
        else{
            System.out.println(pessoa2.nome + " não é de maior");
        }
    }
}
