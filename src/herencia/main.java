package herencia;

public class main {

    public static void main(String[] args) {
        empleado e1 = new empleado("juan", 25000);
        System.out.println("imprimimos el objeto empleado1");
        System.out.println(e1);

        empleado e2 = new empleado("pedro", 15000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Bogota,colombia");
        System.out.println("\n Imprimimos el objeto Empleado2");
        System.out.println(e2);
        
        cliente c1 = new cliente(new java.util.Date(),false);
        System.out.println("\n imprimimos el objetos cliente");
        System.out.println(c1);
        c1.setNombre("nombre");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Mexico, DF");
        System.out.println("\n volvemos a imprimir el objeto cliente");
        System.out.println(c1);
    }
}
