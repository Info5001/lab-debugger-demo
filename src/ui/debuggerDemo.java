package ui;

import model.Ball;

public class debuggerDemo {
    public static void main(String[] args) {

        Ball blue = new Ball("blue");
        Ball red = blue;
        Ball green = red;
        
        blue.setColor("blue");
        red.setColor("red");
        green.setColor("green");

        blue.print();
        red.print();
        green.print();



    }
}
