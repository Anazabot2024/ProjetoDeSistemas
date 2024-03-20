package jogotabuleirocorreto;

public class Jogador {
    private int casaAtual;
    private int meuNumero;

    public int getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(int casaAtual) {
        this.casaAtual = casaAtual;
    }

    public int getMeuNumero() {
        return meuNumero;
    }

    public void setMeuNumero(int meuNumero) {
        this.meuNumero = meuNumero;
    }


    public Jogador(int meuNumero) {
        this.meuNumero = meuNumero;
        this.casaAtual = 0;
          }

    public Jogador(int casaAtual, int meuNumero) {
        this.casaAtual = casaAtual;
        this.meuNumero = meuNumero;
    }
    
        
    public void jogar (Dado dado) {
        casaAtual = casaAtual + dado.rolar();
    }
}
