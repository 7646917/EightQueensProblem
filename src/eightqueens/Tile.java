/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

/**
 *
 * @author Daniel
 */
public class Tile {

    String color;
    boolean occupied = false;
    int boardX, boardY; //Where it is on the chessboard.
    //int posX, posY; //Position on the frame
    
    /**
     * 
     * @param color
     * @param boardX
     * @param boardY 
     */
    public Tile(String color, int boardX, int boardY) {
        this.color = color;
        this.boardX = boardX;
        this.boardY = boardY;
    }

    public int getBoardX() {
        return this.boardX;
    }

    public int getBoardY() {
        return this.boardY;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean getOccupied() {
        return this.occupied;
    }

    public String getColor() {
        return this.color;
    }
}
