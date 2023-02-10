package model;

public class Ball {
    String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println("This Ball is " + color);
    }

}
