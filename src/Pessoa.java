import javax.swing.plaf.synth.SynthSliderUI;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;
    String cpf;

    public Pessoa(String nome, int idade, double peso, double altura,String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }
    public boolean isMaiorDeIdade(){
        return idade >= 18;
    }

    public double IMC(){
        return peso/(altura*altura);
    }

    public void ValidarCPF( String cpf){
        if (cpf.length() == 11) {
            System.out.println("CPF É VALIDO");
        }
        else{
            System.out.println("CPF NÃO É VALIDO");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}