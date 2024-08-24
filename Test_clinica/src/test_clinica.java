/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yerko
 */
public class test_clinica {
    public static void main(String[] args) {
        
        doctor doctor1 = new doctor(21345678, 76, "juan", "perez", "radiologo", "diurno");
        doctor doctor2 = new doctor(32453, 43, "pepe", "alvarez", "fisio", "vespertino");
        doctor doctor3 = new doctor(32456789, 22, "antonio", "navarro", "cirujano", "vespertino");
        
        doctor1.mostrar_datos();
        doctor2.mostrar_datos();
        doctor3.mostrar_datos();
    }
    
    
     
    
}
