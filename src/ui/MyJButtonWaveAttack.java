/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import ui.IsLandUI;

/**
 *
 * @author Dat Ngo
 */
public class MyJButtonWaveAttack extends JButton {

    public MyJButtonWaveAttack() {
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/advisors/military_premium.png")));
        setContentAreaFilled(false);
        setBorder(null);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            }

            public void mouseExited(MouseEvent e) {
                setBorder(null);
            }
        });
    }

}
