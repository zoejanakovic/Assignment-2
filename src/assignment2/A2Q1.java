/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author janaz9178
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating vity
        City kw = new City();
        //creating robot
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        //creating things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        // move karel
        karel.move();
        
        //pick up first thing
        karel.pickThing();
        
        //loop to make karel walk
        while (karel.frontIsClear()) {
            karel.move();
            
            //while he walks he counts his things until he gets 7 and picks up
            if (karel.countThingsInBackpack() < 7) {
                karel.pickThing();
                //if he cant pick up anything, he stops
            }else if(karel.canPickThing()==false)
                break;
            
        }
        
