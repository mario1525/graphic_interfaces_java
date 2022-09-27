package herencia;

import java.util.Date;

public class cliente extends Persona {

    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public cliente(Date fechaRegistro, boolean vip) {
        this.contadorClientes = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    public static void setContadorClientes(int contadorClientes) {
        cliente.contadorClientes = contadorClientes;
    }

    @Override
    public String toSttring() {
        return super.toSttring() + "Cliente{" + " idCliente= " + contadorClientes
                + " fechaRegistro= " + fechaRegistro + " vip= " + vip + "}"; //To change body of generated methods, choose Tools | Templates.
    }

}
