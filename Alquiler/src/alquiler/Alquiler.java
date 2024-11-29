/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquiler;

import Bd.Conexion;
import views.MenuPrincipal;

/**
 *
 * @author Cetecom
 */
public class Alquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
    }
    
}
