
package quiz_polimor;


public class main {
    public static void main(String[] args) {
        
        cajero_titular cajt = new cajero_titular();
        cajt.setNombre("mario");
        cajt.setApellido("beltran");
        cajt.setEdad(24);
        cajt.lugar();
        System.out.println(cajt);
        
        
        cajero_interino caji = new cajero_interino();
        caji.setNombre("mario");
        caji.setApellido("beltran");
        caji.setEdad(24);
        caji.setCalendario(5847);
        caji.setFecha_comienzo("1 de agosto");
        caji.setInterinidad("dos meses ");
        caji.lugar();
        System.out.println(caji);
    }
}
