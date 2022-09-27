
package medios_transporte;

public class Motos extends Transportes{
    private String categoria;

    public Motos(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"Motos{" + "categoria=" + categoria + '}';
    }
   
}
