/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author janaz9178
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating vity
        City kw = new City();
        //creating a robot
        Robot karel = new Robot(kw, 4, 2, Direction.EAST);
        //creating the course
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 8, Direction.SOUTH);
        new Wall(kw, 4, 9, Direction.SOUTH);
        new Wall(kw, 4, 10, Direction.SOUTH);
        //creating hurdles
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 3, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 8, Direction.EAST);
        //finish line
        new Thing(kw, 4, 10);

        //loop karel to move
        while (karel.canPickThing() == false) {
            if (karel.frontIsClear()) {
                karel.move();
                //comes to hurdle, goes around
            } else if (karel.frontIsClear() == false) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();

            }
        }

    }
