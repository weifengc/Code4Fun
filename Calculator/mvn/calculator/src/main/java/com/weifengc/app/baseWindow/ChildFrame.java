package com.weifengc.app.baseWindow;

import com.weifengc.app.Utils;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * This is an example, showing how to use override BaseFrame and create a simple new Frame.
 */
public class ChildFrame extends BaseFrame {
    private static int counter = 0;
    private static void counterPlus(){
        counter++;
        Utils.log("Counter ++, " + counter);
    }


    protected void addComponents() {
        Utils.log("Adding component to ChildFrame...");
        add(new Label("This is a child window."));
        add(new MyButton("+"));

    }

    class MyButton extends Button {
        private String val;

        public MyButton(String val) {
            Utils.log("Creating a new Button...");
            this.val = val;
            setLabel(val);
            addMouseListener(new ButtonListener());
        }

        class ButtonListener implements MouseListener {
            public void mouseClicked(MouseEvent e) {
                Utils.log("Mouse clicked on button " + val);
                counterPlus();
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }
        }

    }
}
