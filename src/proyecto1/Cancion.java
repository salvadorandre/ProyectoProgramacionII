/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Andre
 */
public class Cancion {
    private Clip cancion; 
    
    public void cargarCancion(String url) { 
        try { 
            File archivoCancion = new File(url); 
            AudioInputStream cancionInput = AudioSystem.getAudioInputStream(archivoCancion); 
            cancion = AudioSystem.getClip(); 
            cancion.open(cancionInput);
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            
        }
    }
    
    public void reproducirCancion() { 
        if(cancion != null) { 
            cancion.setFramePosition(0);
            cancion.start(); 
        }
    }
    
    public void detenerCancion() {
        if(cancion.isRunning() && cancion != null) { 
            cancion.stop();
        }
    }
}
