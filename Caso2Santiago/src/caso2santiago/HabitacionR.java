package caso2santiago;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author compr
 */
public class HabitacionR {
    //Caracteristicas de habitacion
    private int NumHabitacion;
    private String Caracteristicas;
    private double Precio;
    private String estado;
    private String TipoHabitacion;
    private String Piso;

    public HabitacionR(int NumHabitacion,String Piso, String Caracteristicas, double Precio, String estado, String TipoHabitacion) {
        this.NumHabitacion = NumHabitacion;
        this.Caracteristicas = Caracteristicas;
        this.Precio = Precio;
        this.estado = estado;
        this.TipoHabitacion = TipoHabitacion;
        this.Piso=Piso;
        
        
    }

    public int getNumHabitacion() {
        return NumHabitacion;
    }

    public void setNumHabitacion(int NumHabitacion) {
        this.NumHabitacion = NumHabitacion;
    }
    
    public void setPiso(String Piso) {
        this.Piso = Piso;
    }
    
     public String getPiso() {
        return Piso;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
     
    

  
    
    
    
    
}
