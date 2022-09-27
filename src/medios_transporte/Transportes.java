
package medios_transporte;


public class Transportes {
  private int N_ruedas;
  private String tipo_traccion;
  private String marca;
  
   public Transportes() {}       
    

    public Transportes(String marca) {
        this.marca = marca;
    }

    public Transportes(int N_ruedas, String tipo_traccion, String marca) {
        this.N_ruedas = N_ruedas;
        this.tipo_traccion = tipo_traccion;
        this.marca = marca;
    }

    public int getN_ruedas() {
        return N_ruedas;
    }

    public void setN_ruedas(int N_ruedas) {
        this.N_ruedas = N_ruedas;
    }

    public String getTipo_traccion() {
        return tipo_traccion;
    }

    public void setTipo_traccion(String tipo_traccion) {
        this.tipo_traccion = tipo_traccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Transportes{" + "N_ruedas=" + N_ruedas + ", tipo_traccion=" + tipo_traccion + ", marca=" + marca + '}';
    }
  
  
}
