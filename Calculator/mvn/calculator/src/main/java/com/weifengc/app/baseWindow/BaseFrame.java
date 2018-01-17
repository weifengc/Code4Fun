package com.weifengc.app.baseWindow;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * BaseFrame is used to be inherited by different child frames.
 */
public abstract class BaseFrame extends Frame {
    protected int width = 250;
    protected int height = 100;
    protected LayoutManager layout = new FlowLayout();
    protected String title = "Base Frame Title";
    protected WindowListener windowListener = new BaseWindowListener();


    static class BaseWindowListener implements WindowListener{

        public void windowOpened(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }
    }

    public BaseFrame() {
        setLayout(layout);
        addComponents();
        setTitle(title);
        setSize(width, height);
        setVisible(true);
        addWindowListener(this.windowListener);
    }

    /**
     * Add components to the frame.
     * Must be override by its child classes.
     */
    protected abstract void addComponents();
}
