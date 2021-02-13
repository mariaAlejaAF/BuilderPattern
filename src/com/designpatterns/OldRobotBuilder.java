package com.designpatterns;

public class OldRobotBuilder implements RobotBuilder{

    private Robot robot;

    public OldRobotBuilder(){
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("An Old Head");

    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("An Old Torso");

    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Old Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Old Legs");
    }

    @Override
    public Robot getFinalRobot() {
        return this.robot;
    }

}
