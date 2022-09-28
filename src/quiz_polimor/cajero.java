
package quiz_polimor;


public abstract class cajero extends persona {
    private int id_cajero;

    public int getId_cajero() {
        return id_cajero;
    }

    public void setId_cajero(int id_cajero) {
        this.id_cajero = id_cajero;
    }
    
    public abstract void lugar();

    @Override
    public String toString() {
        return super.toString()+"cajero{" + "id_cajero=" + id_cajero + '}';
    }
    
    
}
