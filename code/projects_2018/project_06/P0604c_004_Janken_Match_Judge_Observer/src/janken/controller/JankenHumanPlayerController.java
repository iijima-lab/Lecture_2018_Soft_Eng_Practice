/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.controller;

import janken.model.JankenPlayer;
import janken.view.JankenPlayerControlPanel;
import janken.view.JankenPlayerView;

/**
 *
 * @author iijim
 */
public class JankenHumanPlayerController extends JankenPlayerController {

    public JankenHumanPlayerController(JankenPlayer player,
            JankenPlayerView playerView,
            JankenPlayerControlPanel playerControlPanel) {
        super(player, playerView, playerControlPanel);
    }

    public void guu() {
        player.guu();
    }

    public void choki() {
        player.choki();
    }
    public void paa() {
        player.paa();
    }
}
