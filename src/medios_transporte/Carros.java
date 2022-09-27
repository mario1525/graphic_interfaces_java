
package medios_transporte;

public class Carros extends Transportes{
    private int n_ocupantes;

    public Carros(int n_ocupantes) {
        this.n_ocupantes = n_ocupantes;
    }

    public int getN_ocupantes() {
        return n_ocupantes;
    }

    public void setN_ocupantes(int n_ocupantes) {
        this.n_ocupantes = n_ocupantes;
    }

    @Override
    public String toString() {
        return super.toString()+"Carros{" + "n_ocupantes=" + n_ocupantes + '}';
    }
    
    
}
