package ies.ngm;

public abstract class Monton {

    private ArrayList<Carta> cartas;

    public synchronized Carta moverCarta(Carta c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public synchronized boolean esValido(Carta c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void generarMonton(ArrayList<Carta> cartas) {
    }
}
