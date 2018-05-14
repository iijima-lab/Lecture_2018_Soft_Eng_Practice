/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.model;

import java.util.Observable;
import java.util.Random;

/**
 * じゃんけん
 * @author 飯島 正 (iijima@ae.keio.ac.jp)
 */
public class JankenPlayer extends Observable {
    private Random randomGenerator = null;
    private String name = null;
    private int hand = 0;
    private static String[] handName = {"ぐー","ちょき","ぱー"};
    public JankenPlayer() {
        this("noname");
    }
    public JankenPlayer(String name) {
        this.name = name;
        hand = 0;
        randomGenerator = new Random();
    }
   
    public void pon() {
        hand = randomGenerator.nextInt(3);
        System.out.println(hand);
        changed();
    }
    public void guu() {
        hand = 0;
        changed();
    }
    public void choki() {
        hand = 1;
        changed();
    }
    public void paa() {
        hand = 2;
        changed();
    }
    public int getHand() {
        return( hand );
    }
    
    public String getHandString() {
        return( handName[hand] );
    }
    public void setHand(int hand) {
        this.hand = hand;
    }
    public String getName() {
        return( name );
    }
    public void setName( String name ) {
        this.name = name;
    }
    private void changed() {
        setChanged();
        notifyObservers();
    }
    
}
