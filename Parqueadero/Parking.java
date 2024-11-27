package Parqueadero;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Parking {
    private String tarifa;
    private String nombre;
    private String vehiculo;
    private String placa;
    private Date fechaIngreso;
    private Date fechaSalida;
    public Parking(){
    }
    
    public Parking(String tarifa, String nombre, String vehiculo, String placa, Date fechaIngreso,Date fechaSalida) {
        this.tarifa = tarifa;
        this.nombre = nombre;
        this.vehiculo=vehiculo;
        this.placa = placa;
        this.fechaIngreso= fechaIngreso;
        this.fechaSalida= fechaSalida;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
  
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void fechaIngreso(Date Fechaingreso) {
        this.fechaIngreso = Fechaingreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void fechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    

    @Override
    public String toString() {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String fechaIngresotoString = format.format(fechaIngreso);
    String fechaSalidatoString;
    if(fechaSalida == null){
        fechaSalidatoString = "No hay vehiculo";
    }
    else{
        fechaSalidatoString = format.format(fechaSalida);    
    }
    return tarifa + "," + nombre + "," + vehiculo + "," + placa  +","+ fechaIngresotoString+","+fechaSalidatoString;
    }
}
