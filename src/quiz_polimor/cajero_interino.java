
package quiz_polimor;


public class cajero_interino extends cajero {
private int calendario;
private String fecha_comienzo;
private String interinidad;

    public cajero_interino() {
    }



    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public String getFecha_comienzo() {
        return fecha_comienzo;
    }

    public void setFecha_comienzo(String fecha_comienzo) {
        this.fecha_comienzo = fecha_comienzo;
    }

    public String getInterinidad() {
        return interinidad;
    }

    public void setInterinidad(String interinidad) {
        this.interinidad = interinidad;
    }


    @Override
    public void lugar() {
        System.out.println("barranquilla");
    }

    @Override
    public String toString() {
        return super.toString()+ "cajero_interino{" + "calendario=" + calendario + ", fecha_comienzo=" + fecha_comienzo + ", interinidad=" + interinidad + '}';
    }
    
    
    
}
