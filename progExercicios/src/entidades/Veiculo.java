package entidades;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int quantidade = 0;

    public Veiculo(){
    }
    public Veiculo(String tipo, String cor, int quantidade) {
        this.tipo = tipo;
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Tipo: " + this.tipo + " " +
                " Cor: " + this.cor + " " +
                " Quantidade de rodas: " + this.quantidade + " ";
    }
}
