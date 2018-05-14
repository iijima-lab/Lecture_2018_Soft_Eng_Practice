/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.controller;

import janken.model.JankenMatch;
import janken.view.JankenMatchControlPanel;
import janken.view.JankenMatchView;

/**
 *
 * @author iijim
 */
public class JankenMatchController {

    private JankenMatch match = null;
    private JankenMatchView matchView = null;
    private JankenMatchControlPanel matchControlPanel = null;

    public JankenMatchController(JankenMatch match,
            JankenMatchView matchView,
            JankenMatchControlPanel matchControlPanel) {
        this.match = match;
        this.matchView = matchView;
        this.matchControlPanel = matchControlPanel;

    }

    public void judge() {
        match.judge();
        int winner = match.getWinner();
        System.out.println(match.getJudge());
    }

}
