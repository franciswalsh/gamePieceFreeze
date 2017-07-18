package com.company;

/**
 * Created by franciswalsh on 7/18/17.
 */
public class GamePiece {

    int positionX;
    int positionY;
    int minX = 0;
    int minY = 0;
    int maxX = 100;
    int maxY = 500;
    boolean frozen;
    String name;
    String color;

    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionX(){
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
    public int getMinX(){
        return this.minX;
    }
    public int getMinY(){
        return this.minY;
    }
    public int getMaxX(){
        return this.maxX;
    }
    public int getMaxY(){
        return this.maxY;
    }
    public boolean getFrozen(){
        return this.frozen;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void move(int x, int y){

        if (this.getFrozen()) {
            System.out.println("Piece is frozen and cannot move to postion: (" + x + "," + y + ").");
        }
        else if ((x > this.getMaxX() && y > this.getMaxY()) || x < this.getMinX() && y < this.getMinY()){
            System.out.println("Sorry, both x and y are outside of their respective bounds");
        }
        else if (x > this.getMaxX() || x < this.getMinX()) {
            System.out.println("Sorry, " + x + " is outide of the x bound");
        }
        else if (y > this.getMaxY() || y < this.getMinY()) {
            System.out.println("Sorry, " + y + " is outide of the y bound");
        }
        else {
            this.positionX = x;
            this.positionY = y;
        }
    }
    public void freeze(){
        this.frozen = true;
    }
    public void unfreeze(){
        this.frozen = false;
    }

}
