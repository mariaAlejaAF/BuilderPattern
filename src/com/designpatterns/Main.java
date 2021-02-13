package com.designpatterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RobotBuilder builder = new OldRobotBuilder();

        EngineerDirector director = new EngineerDirector(builder);

        director.createRobot();

        Robot myRobot = director.getRobot();

        System.out.println(myRobot.getArms());
        System.out.println(myRobot.getHead());
        System.out.println(myRobot.getLegs());
        System.out.println(myRobot.getTorso());

    }
}
