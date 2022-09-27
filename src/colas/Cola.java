package colas;

public class Cola {

    private Nodo inicio;
    private int tamanio;

    public Cola() {
        inicio = null;
        tamanio = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void mostrarCola() {
        if (!vacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.println(i + ".[" + aux.getValor() + "] ->");
                aux = aux.getSiguiente();
                i++;
            }

        }
    }

    public void sacar() {
        if (vacia()) {
            System.out.println("cola vacia");
        } else {
            Nodo aux = inicio;
            for (int i = 0; i < tamanio - 2; i++) {
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(null);
            tamanio--;
        }   

    }

    public void add(int valor) {
        Nodo N = new Nodo();
        N.setValor(valor);

        if (vacia()) {
            inicio = N;
        } else {
            N.setSiguiente(inicio);
            inicio = N;
        }
        tamanio++;
    }

}
