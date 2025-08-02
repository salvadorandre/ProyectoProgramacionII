/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Andre
 */
public class Instrumento {
    
    private String tipoVibracion; 

    public String getTipoVibracion() {
        return tipoVibracion;
    }

    public void setTipoVibracion(String tipoVibracion) {
        this.tipoVibracion = tipoVibracion;
    }
    
    
    public void sonido() {
        System.out.println("EMITE SONIDO");
    }
    
    public void cancion() {
        System.out.println("Emite cancion");
    }
}
