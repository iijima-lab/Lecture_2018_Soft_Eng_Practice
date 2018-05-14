/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.controller.JankenHumanPlayerController;
import janken.controller.JankenPlayerController;
import janken.model.JankenPlayer;
import java.awt.BorderLayout;

/**
 *
 * @author iijim
 */
public class JankenHumanPlayerFrame extends JankenPlayerFrame {

    public JankenHumanPlayerFrame(JankenPlayer player) {
        super(player);
        playerView = new JankenHumanPlayerView(player);
        playerControlPanel = new JankenHumanPlayerControlPanel(player);
        playerController = new JankenHumanPlayerController(player,
                playerView, playerControlPanel);
        playerControlPanel.setController(playerController);

        setLayout(new BorderLayout());
        add(playerView, BorderLayout.CENTER);
        add(playerControlPanel, BorderLayout.SOUTH);
        pack();
    }
}
