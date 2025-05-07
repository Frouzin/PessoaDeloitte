public class Produto {
    String produto;
    double preco;

    public Produto(String produto,double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularValorDesconto(double percentual){
        return preco * (percentual/100);
    }

    public double aplicarDesconto(double percentual){
        double valorDesconto = calcularValorDesconto(percentual);
        return preco - valorDesconto;
    }

}



