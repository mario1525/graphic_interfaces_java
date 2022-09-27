package medios_transporte;

public class Camiones extends Transportes{
    private int peso_max;

    public Camiones(int peso_max) {
        this.peso_max = peso_max;
    }

    public int getPeso_max() {
        return peso_max;
    }

    public void setPeso_max(int peso_max) {
        this.peso_max = peso_max;
    }

    @Override
    public String toString() {
        return super.toString()+"Camiones{" + "peso_max=" + peso_max + '}';
    }
    
    
}
