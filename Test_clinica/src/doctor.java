/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yerko
 */
public class doctor {
    //atributos
    private int rut, edad;
    private String nombre,apellido, especialidad, turno ;
    
    

    //constructores 

    public doctor() {
    }

    public doctor(int rut, int edad, String nombre, String apellido, String especialidad, String turno) {
        this.rut = rut;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.turno = turno;
    }
    
    
    // getter y setter 
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "doctor{" + "rut=" + rut + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", turno=" + turno + '}';
    }
    
    
    
  
        
   
    
    //metodos
    public void mostrar_datos(){
        if (getEspecialidad().equalsIgnoreCase("radiologo")){
            System.out.println(toString());
        }else{
            System.out.println("no es radiologo");
        }
            
    
}
    
}
