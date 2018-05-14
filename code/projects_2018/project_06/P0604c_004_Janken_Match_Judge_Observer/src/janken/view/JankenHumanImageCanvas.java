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
public class JankenHumanImageCanvas extends JankenImageCanvas {
    private static String IMAGE_RESOURCE_PATH = "janken/image/human/";

    public JankenHumanImageCanvas(JankenPlayer player) {
        super(player, IMAGE_RESOURCE_PATH);
    }
}
