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
public class Queen {
    
    private Tile position;
    
    public Queen(){
    }
    
    public Queen(Tile position){
        this.position = position;
    }
    
    public Tile getPosition(){
        return this.position;
    }
    
    
}
