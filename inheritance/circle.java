/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ahmad Hamed
 */
class circle {
      private double radius ;
    private String color ;
    
    public circle(){
        radius=1.0;
        color="red";
    }
    
    public circle(double radius){
        this.radius=radius;
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public circle(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String tostring(){
        return"radius="+radius+"\n"+"color is"+color;
    }

}
