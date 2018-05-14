/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken.view;

import janken.model.JankenPlayer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

/**
 *
 * @author iijim
 */
public class JankenImageCanvas extends javax.swing.JPanel {
    private static String IMAGE_RESOURCE_PATH = "janken/image/";
    protected String imageResourcePath = IMAGE_RESOURCE_PATH;

    protected JankenPlayer player = null;
    protected Image handImage[];

    public JankenImageCanvas(JankenPlayer player) {
        this( player, IMAGE_RESOURCE_PATH );
    }
    public JankenImageCanvas(JankenPlayer player, String imageResourcePath ) {
        this.player = player;
        this.imageResourcePath = imageResourcePath;
        System.out.println(imageResourcePath);
        handImage = new Image[3];
        for (int i = 0; i <= 2; i++) {
            URL url = getClass().getClassLoader().getResource(
                    imageResourcePath + i + ".jpg");
            System.out.println(url);
            handImage[i] = getToolkit().getImage(url)
                    .getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        }

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 200));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int hand = player.getHand();
        Image img = handImage[hand];
        if (img != null) {
            g.drawImage(img, 0, 0, this);
        }
    }
}