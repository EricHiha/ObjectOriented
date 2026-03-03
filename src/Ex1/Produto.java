package Ex1;

public class Produto {
    String nome;
    double valor;
    int quantidade;

    public Produto(String n, double v, int q){
        nome = n;
        valor=v;
        quantidade=q;
    }

    public void aumento(double procentagem){
        valor *= (1 + procentagem/100);
    }
}
