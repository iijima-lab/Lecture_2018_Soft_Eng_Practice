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
public class JankenComputerPlayerController  extends JankenPlayerController {
    public JankenComputerPlayerController(JankenPlayer player, 
                JankenPlayerView playerView, 
                JankenPlayerControlPanel playerControlPanel) {
        super(player, playerView, playerControlPanel);
    }
}
