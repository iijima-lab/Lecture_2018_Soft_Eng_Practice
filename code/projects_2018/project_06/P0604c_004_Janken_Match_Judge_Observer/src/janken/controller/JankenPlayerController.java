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
public class JankenPlayerController {
    protected JankenPlayer player = null;
    protected JankenPlayerView playerView = null;
    protected JankenPlayerControlPanel playerControlPanel = null;
    
    public JankenPlayerController(JankenPlayer player, 
                JankenPlayerView playerView, 
                JankenPlayerControlPanel playerControlPanel) {
        this.player = player;
        this.playerView = playerView;
        this.playerControlPanel = playerControlPanel;
        
    }
    
    public void pon() {
        player.pon();
    }
}
