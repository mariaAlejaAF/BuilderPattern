package com.designpatterns;

public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getFinalRobot();
}
