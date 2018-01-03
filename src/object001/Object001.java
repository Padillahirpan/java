/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object001;

/**
 *
 * @author hellodood
 */
public class Object001 {
    
    //We are gonna making a car
    
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    
    //function
    public void printVariable(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        
    }
    
    public void changeSpeed(){
        maxSpeed = 101;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Object001 familyCar = new Object001();
        System.out.println("This is family's car");
        familyCar.printVariable();
        Object001 nanaCar = familyCar;
        nanaCar.changeSpeed();
        nanaCar.printVariable();
        System.out.println("This is the family car after change speed");
        familyCar.printVariable();
        
        
        
        
    }
    
}
