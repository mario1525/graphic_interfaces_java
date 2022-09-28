
package quiz_polimor;


public class cajero_titular extends cajero{

    public cajero_titular() {
    }
    

    @Override
    public void lugar() {
         System.out.println("barranquilla");
    }

    @Override
    public String toString() {
        return super.toString()+ "cajero_titular{" + '}';
    }
    
    
    
}
