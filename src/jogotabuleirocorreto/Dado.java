package jogotabuleirocorreto;

public class Dado {
    private int numeroAtual;
    
    public Dado () {}

    public int getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    
    
    public int rolar() {
            numeroAtual=(int)(Math.random()*6)+1;
            return numeroAtual;
    }
}
