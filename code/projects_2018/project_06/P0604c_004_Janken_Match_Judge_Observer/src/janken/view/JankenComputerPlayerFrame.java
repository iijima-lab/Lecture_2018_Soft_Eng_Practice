/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.controller.JankenComputerPlayerController;
import janken.controller.JankenPlayerController;
import janken.model.JankenPlayer;
import java.awt.BorderLayout;

/**
 *
 * @author iijim
 */
public class JankenComputerPlayerFrame extends JankenPlayerFrame {

    public JankenComputerPlayerFrame(JankenPlayer player) {
        super(player);
        playerView = new JankenComputerPlayerView(player);
        playerControlPanel = new JankenComputerPlayerControlPanel(player);
        playerController = new JankenComputerPlayerController(player,
                playerView, playerControlPanel);
        playerControlPanel.setController(playerController);

        setLayout(new BorderLayout());
        add(playerView, BorderLayout.CENTER);
        add(playerControlPanel, BorderLayout.SOUTH);
        pack();
    }
}
