/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author iijim
 */
public class JankenMatch extends Observable implements Observer {
    private JankenPlayer player0 = null;
    private JankenPlayer player1 = null;
    private JankenPlayer[] players = null;
    private int winner = 0;
    
    public JankenMatch() {
        player0 = new JankenPlayer("プレイヤ-1");
        player1 = new JankenPlayer("プレイヤ-2");
        players = new JankenPlayer[]{player0,player1};
        
        for ( JankenPlayer player : players ) {
            player.addObserver(this);
        }
    }
    public JankenPlayer[] getPlayers() {
        return( players );
    }
    public int getWinner() {
        return( winner );
    }
    public String getJudge() {
        if (winner == -1) {
            return("あいこ");
        } else {
            return(players[winner].getName() + "の勝ち");
        }
    }
    public void judge() {
        winner = judgeWinner();
        changed();
    }
    public int judgeWinner() {
        // 本当は剰余系を使うと，もっと簡単に書けます．それは，また後程
        int hand0 = players[0].getHand();
        int hand1 = players[1].getHand();
        
        if ( hand0 == hand1 ) {
            return( -1 );
        } else if ( hand0 == 0 && hand1 == 1) { // グーとチョキ
            return( 0 );
        } else if ( hand0 == 0 && hand1 == 2) { // グーとパー
            return( 1 );
        } else if ( hand0 == 1 && hand1 == 0) { // チョキとグー
            return( 1 );
        } else if ( hand0 == 1 && hand1 == 2) { // チョキとパー
            return( 0 );
        } else if ( hand0 == 2 && hand1 == 0) { // パーとグー
            return( 0 );
        } else if ( hand0 == 2 && hand1 == 1) { // パーとチョキ
            return( 1 );
        } else { // ここには到達しない
            return( -1 );
        }
    }
    private void changed() {
        setChanged();
        notifyObservers();
    }
    
    public void update( Observable o, Object data ) {
        if (o==players[0]) {
            players[1].pon();
        }
        judge();
    }
    
}
