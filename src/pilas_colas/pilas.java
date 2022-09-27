
package pilas_colas;


public class pilas {
    private Nodo inicio;
    private int tamanio;

    public pilas() {
        inicio = null;
        tamanio = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public int tamanio() {
        return tamanio;
    }
    public void mostrarpila() {
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
    
    public void sacar(){
        if(vacia()){
            System.out.println("pila vacia");
        }else{
            inicio = inicio.getSiguiente();
        }
        
    }
     public void addini(int valor) {
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
