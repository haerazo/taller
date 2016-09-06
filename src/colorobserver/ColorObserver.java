/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorobserver;

/**
 *
 * @author toshi
 */
public class ColorObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseObservador observador=new ClaseObservador();
        VentanaOpciones miVentanaOpciones = new VentanaOpciones(observador);
        VentanaSeleccion miVentanaSeleccion = new VentanaSeleccion(observador);
        VentanaColor miVentanaColor = new VentanaColor(observador);
        
        miVentanaColor.setVisible(true);
        miVentanaSeleccion.setVisible(true);
        miVentanaOpciones.setVisible(true);
        
        observador.addObserver(miVentanaColor);
        observador.addObserver(miVentanaSeleccion);
        observador.addObserver(miVentanaOpciones);
    }
    
}
