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
        Robot karel = new Robot(kw, 7, 5, Direction.EAST);
        //loop for positive streets
        while (karel.getStreet() > 0) {

            if (karel.getDirection() == Direction.NORTH) {
                karel.move();
            } else if (karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }
        }
        //loop for negative streets
        while (karel.getStreet() < 0) {
            if (karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.SOUTH) {
                karel.move();
            } else if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.move();
            }

        }
        //loop for positive avenues
        while (karel.getAvenue() > 0) {
            if (karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                karel.move();
            }else if (karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.WEST) {
                karel.move();
            }
        }
        //loop for negative avenues
        while (karel.getAvenue() < 0) {
            if (karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                karel.move();
            } else if (karel.getDirection() == Direction.EAST) {
                karel.move();
            }
        }
    }
