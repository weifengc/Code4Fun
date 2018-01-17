package com.weifengc.app.baseWindow;

import java.awt.*;

/**
 * BaseFrame is used to be inherited by different child frames.
 */
public abstract class BaseFrame extends Frame{
    protected int width = 250;
    protected int height = 100;
    protected LayoutManager layout = new FlowLayout();
    protected String title = "Base Frame Title";

    public BaseFrame(){
        setLayout(layout);
        addComponents();
        setTitle(title);
        setSize(width, height);
        setVisible(true);
    }

    /**
     * Add components to the frame.
     * Must be override by its child classes.
     */
    protected abstract void addComponents();
}
