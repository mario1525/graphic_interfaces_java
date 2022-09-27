package herencia;

public class empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public empleado(String nombre, double sueldo ) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "empleado{" + " idEmpleado= " + idEmpleado
                + " sueldo= " + sueldo + "}";
    }

}
