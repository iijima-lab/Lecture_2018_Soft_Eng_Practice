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
    private int hand = 0;
    private static String[] handName = {"ぐー","ちょき","ぱー"};
    public JankenPlayer() {
        hand = 0;
        randomGenerator = new Random();
    }
    public void pon() {
        hand = randomGenerator.nextInt(3);
        System.out.println(hand);
        changed();
    }
    public int getHand() {
        return( hand );
    }
    
    public String getHandString() {
        return( handName[hand] );
    }
    
    private void changed() {
        setChanged();
        notifyObservers();
    }
    
}
