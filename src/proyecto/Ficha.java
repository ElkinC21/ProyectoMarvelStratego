/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package proyecto;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author elkin
 */
public class Ficha {
 
 private String Nombre;
 private ImageIcon Icono;
 private String Tipo;
 private int Rango;
 private boolean movio;
 
 
 
 public Ficha(String Nombre, ImageIcon Icono, String Tipo, int Rango){
this.Nombre=Nombre;
this.Icono=Icono;
this.Tipo=Tipo;
this.Rango=Rango;
this.movio=false;

 }
   public String getNombre() {
   return Nombre;
   }     
 public ImageIcon getIcono() {
   return Icono;
   }     
   public String getTipo() {
   return Tipo;
   }     
   public int getRango() {
   return Rango;
   }     
   public boolean getmovio() {
   return movio;
   }     
public void mover() {
   movio=true;
   }     

   
}
