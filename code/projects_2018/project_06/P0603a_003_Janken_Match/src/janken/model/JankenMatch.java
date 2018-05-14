/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.model;

/**
 *
 * @author iijim
 */
public class JankenMatch {
    private JankenPlayer player1 = null;
    private JankenPlayer player2 = null;
    private JankenPlayer[] players = null;
    public JankenMatch() {
        player1 = new JankenPlayer("プレイヤ-1");
        player2 = new JankenPlayer("プレイヤ-2");
        players = new JankenPlayer[]{player1,player2};
    }
    public JankenPlayer[] getPlayers() {
        return( players );
    }
}
