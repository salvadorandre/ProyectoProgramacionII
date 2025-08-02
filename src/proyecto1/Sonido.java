/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Andre
 */
public class Sonido {
    
    private Clip sonido; 
    
    public void subirSonido(String url){
        try {
            File archiSonido = new File(url); 
            System.out.println(archiSonido);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archiSonido); 
            sonido = AudioSystem.getClip();
            sonido.open(audioStream);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
  
    public void reproducirSonido() {            
        if(sonido != null) {
            sonido.setFramePosition(0);
            sonido.start();
        }
        else {
            System.out.println("Archivo nulo");
        }
    }
    
    public void detenerSonido() { 
        if(sonido != null && sonido.isRunning()) { 
            sonido.stop();
        }
    }
    
}
