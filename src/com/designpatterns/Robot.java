package com.designpatterns;

public class Robot implements RobotPlan{


    private String head;
    private String arms;
    private String torso;
    private String legs;

    public String getHead() {
        return head;
    }

    public String getArms() {
        return arms;
    }

    public String getTorso() {
        return torso;
    }

    public String getLegs() {
        return legs;
    }


    @Override
    public void setRobotHead(String robotHead) {
        head = robotHead;
    }

    @Override
    public void setRobotArms(String robotArms) {
        arms = robotArms;
    }

    @Override
    public void setRobotTorso(String robotTorso) {
        torso = robotTorso;
    }

    @Override
    public void setRobotLegs(String robotLegs) {
        legs = robotLegs;
    }
}