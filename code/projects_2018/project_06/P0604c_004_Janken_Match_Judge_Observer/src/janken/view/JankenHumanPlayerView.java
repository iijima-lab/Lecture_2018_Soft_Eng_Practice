/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.model.JankenPlayer;
import java.awt.BorderLayout;

/**
 *
 * @author iijim
 */
public class JankenHumanPlayerView extends JankenPlayerView {

    public JankenHumanPlayerView(JankenPlayer player) {
        super(player);
        setCanvas(new JankenHumanImageCanvas(player));
    }
}
