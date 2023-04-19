/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ahmad Hamed
 */
class cylinder extends circle {
      private double hight ;
    public cylinder (){
        hight=1.0 ;
    }
    public cylinder(double radius){
        super(radius);
    }

    public cylinder(double hight, double radius) {
        super(radius);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }
    
    public double getvolume(){
        return 3.14*Math.pow(super.getRadius(),2)*hight;
    }
           
          
    
}
