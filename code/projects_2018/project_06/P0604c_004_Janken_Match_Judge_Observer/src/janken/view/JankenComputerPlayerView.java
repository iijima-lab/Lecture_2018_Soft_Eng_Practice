/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.model.JankenPlayer;

/**
 *
 * @author iijim
 */
public class JankenComputerPlayerView extends JankenPlayerView  {
     public JankenComputerPlayerView(JankenPlayer player) {
        super(player);
        setCanvas(new JankenComputerImageCanvas(player));
    }   
}
