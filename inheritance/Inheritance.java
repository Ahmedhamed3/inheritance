/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ahmad Hamed
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle c = new circle(16,"red"); 
        System.out.println(c.tostring());
        cylinder c1 = new cylinder(2,4);
        System.out.println(c1.getvolume());
    }
    
}
