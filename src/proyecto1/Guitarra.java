/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Andre
 */
public class Guitarra extends Instrumento {
    private String marca, urlCancion, urlSonido;
    Sonido sonido;
    Cancion cancion; 
    
    public Guitarra(String marca, String urlSonido, String urlCancion) { 
        this.marca = marca; 
        this.urlCancion = urlCancion; 
        this.sonido = new Sonido(); 
        this.urlSonido = urlSonido;
        this.cancion = new Cancion(); 
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
   
    @Override
    public void sonido(){
        
        this.sonido.subirSonido(this.urlSonido);
        this.sonido.reproducirSonido();
    }
    
    public void detenerSonido() { 
        this.sonido.detenerSonido();
    }
    @Override
    public void cancion() {
        this.cancion.cargarCancion(this.urlCancion);
        this.cancion.reproducirCancion();
    }
    
    public void detenerCancion() { 
        this.cancion.detenerCancion();
    }
    
}
   

