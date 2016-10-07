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
public class ChessBoard {

    private final Tile[][] tiles;
    private final Queen[] queens;

    public ChessBoard(int size, Queen[] queens) {
        tiles = new Tile[size][size];
        this.queens = queens;
    }

    public void solveProblem() {
        System.out.println("Solving Eight Queens Problem");
        System.out.println("Size of board is " + getSize());

        System.out.println("A possible solution is: ");

        for (String s : checkPosition()) {
            System.out.println("Queen at: " + s);
        }
    }

    public String[] checkPosition() {
        //For every queen, check if
        String[] result = new String[8];
        
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
        

        return result;
    }

    public Tile[][] getTiles() {
        return this.tiles;
    }

    public int getSize() {
        return this.tiles.length;
    }

}
