package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece firstPiece = new GamePiece();

        if (firstPiece.getFrozen() == false){
            firstPiece.freeze();
        }
        else {
            System.out.println("The game piece is not initially frozen");
        }

        if (firstPiece.getFrozen()){
            firstPiece.unfreeze();
        }
        else {
            System.out.println("The game piece was not frozen");
        }

        firstPiece.move(5, 7);

        System.out.println("The new x position is: " + firstPiece.getPositionX() + ", and the new y position is: " + firstPiece.getPositionY() + ".");

        firstPiece.freeze();

        firstPiece.move(4, 3);

        firstPiece.move(120, 420);

        firstPiece.move(80, 520);

        firstPiece.unfreeze();

        firstPiece.move(100, 500);

        System.out.println("New position x: " + firstPiece.getPositionX() + ". New position y: " + firstPiece.getPositionY() + ".");

        firstPiece.move(100, 520);

        firstPiece.move(120, 500);

        System.out.println("New position x: " + firstPiece.getPositionX() + ". New position y: " + firstPiece.getPositionY() + ".");

        firstPiece.move(120, 520);

        firstPiece.move(-10, -10);

        firstPiece.move(-10, 24);

        firstPiece.move(20, -2);
    }
}
