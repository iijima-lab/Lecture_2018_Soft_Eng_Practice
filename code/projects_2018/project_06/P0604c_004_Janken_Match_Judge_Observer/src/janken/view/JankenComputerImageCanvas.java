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
public class JankenComputerImageCanvas extends JankenImageCanvas {

    private static String IMAGE_RESOURCE_PATH = "janken/image/computer/";

    public JankenComputerImageCanvas(JankenPlayer player) {
        super(player, IMAGE_RESOURCE_PATH);
    }
}
