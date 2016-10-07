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
   
   public ChessBoard(int size){
       tiles = new Tile[size][size];
   }
   
   public Tile[][] getTiles(){
       return this.tiles;
   }
   
   public int getSize(){
       return this.tiles.length;
   }
   
}
