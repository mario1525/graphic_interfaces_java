
package medios_transporte;

public class main {
    public static void main(String[] args) {
        Carros car = new Carros(5);
        car.setMarca("mazda");
        car.setN_ruedas(4);
        car.setTipo_traccion("AWD");
        System.out.println(car);
        
        Motos mot = new Motos("motocros");
        mot.setMarca("ktm");
        mot.setN_ruedas(2);
        mot.setTipo_traccion("RWD");
        System.out.println(mot);
        
        Camiones can = new Camiones(50);
        can.setMarca("kenworth");
        can.setN_ruedas(18);
        can.setTipo_traccion("RWD");
        System.out.println(can);
    }
}

