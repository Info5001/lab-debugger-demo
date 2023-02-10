package ui;

import model.Ball;

public class debuggerDemo {
    public static void main(String[] args) {




        int a = 10;
        int b = 5;
       
        int c = a;
        b = c;
        a = 100;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Ball blue = new Ball();
        // Ball red = blue;
        // Ball green = red;

        // blue.setColor("blue");
        // red.setColor("red");
        // green.setColor("green");

        // blue.print();
        // red.print();
        // green.print();



    }
}
