/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author janaz9178
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city
        City kw = new City();
        //create robot
        Robot karel = new Robot(kw, 3, 5, Direction.EAST);
        //loop
        while(karel.getStreet()!= 0){
            if(karel.getDirection()== Direction.NORTH);{
            karel.move();
        }else
            
    }
}
