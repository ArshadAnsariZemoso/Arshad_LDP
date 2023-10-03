package com.solid.isp;

public class Main {
    public static void main(String[] args) {
        RegularEmployee employee = new RegularEmployee();
        Robot robot = new Robot();

        employee.work();

        robot.work();
        robot.recharge();
    }
}
