package com.designpatterns;

public class EngineerDirector {

    RobotBuilder builder;

    public EngineerDirector(RobotBuilder builder){
        this.builder = builder;
    }

    public Robot getRobot(){
        return builder.getFinalRobot();
    }

    public void createRobot(){
        builder.buildRobotHead();
        builder.buildRobotArms();
        builder.buildRobotTorso();
        builder.buildRobotLegs();
    }
}
