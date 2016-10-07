/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ChessBoard {

    private Tile[][] tiles;
    private final ArrayList<Queen> queens;
    private final int numOfQueens = 8;

    public ChessBoard(int size, ArrayList<Queen> queens) {
        tiles = new Tile[size][size];
        this.queens = queens;
        createTiles();
    }

    public ChessBoard(int size) {
        tiles = new Tile[size][size];
        queens = new ArrayList<>();
        createTiles();
    }

    public void createTiles() {
        for (int i = 0; i < tiles.length; i++) {
            for (int z = 0; z < tiles.length; z++) {
                Tile t = new Tile("White", i, z);
                tiles[i][z] = t;
            }
        }
    }

    public void createQueens() {
        for (int i = 0; i < numOfQueens; i++) {
            queens.add(new Queen());
        }
    }

    public void placeQueens() {
        //Place the queens on the chessboard
        for (int i = 0; i < numOfQueens; i++) {
            Queen q = queens.get(i);
            q.setPosition(tiles[0][i]);
        }
    }

    public void printPositions() {
        for (Queen q : queens) {
            System.out.println("Queen at: " + q.getPositionString());
        }
    }

    public void solveProblem() {
        System.out.println("Solving Eight Queens Problem");
        System.out.println("Size of board is " + getSize());

        System.out.println("A possible solution is: ");

        findPositions();
        printPositions();

    }

    public void findPositions() {
        createQueens(); //Creates 8
        placeQueens(); //Sets each one at a unique column.

        /*
    If 
        all queens are placed return true and print the solution matrix.
    Else
        Try all the rows in the cur­rent column.
        Check if queen can be placed here safely if yes mark the current cell in solu­tion matrix as 1 and try to solve the rest of the problem recursively.
        If placing the queen in above step leads to the solu­tion return true.
        If placing the queen in above step does not lead to the solu­tion , BACKTRACK, mark the current cell in solu­tion matrix as 0 and return false.
        If all the rows are tried and noth­ing worked, return false and print NO SOLUTION
        
         */
    }

    public Tile[][] getTiles() {
        return this.tiles;
    }

    public int getSize() {
        return this.tiles.length;
    }

}
