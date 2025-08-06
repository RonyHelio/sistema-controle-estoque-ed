package lojaagricola;

public class Produto {
    private String nome;
    private double preço;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, double preço, int estoque) {
        this.nome = nome;
        this.preço = preço;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return nome + ", " + estoque + " disponiveis. preço: " + preço;
    }

    public String listaEstoque() {
        return nome +", " + estoque + "disponiveis. ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
