package model;

public class Ball {
    String color;

    public Ball(String color) {
        System.out.println("We have created a new instance of a ball with color: " + color );
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("We are setting the color to: " + color );
        this.color = color;
    }

    public void print(){
        System.out.println("This Ball is " + color);
    }

}
