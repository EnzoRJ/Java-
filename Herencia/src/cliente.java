import java.util.Date;

public class cliente extends Persona{
    private int idCLiente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public cliente(Date fechaRegistro, boolean vip){
        this.idCLiente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }


    @Override
    public String toString() {
        return super.toString() + "cliente{" +
                "idCLiente=" + idCLiente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                '}';
    }

    public int getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
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
}
