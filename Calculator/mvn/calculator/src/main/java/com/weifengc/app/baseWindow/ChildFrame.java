package com.weifengc.app.baseWindow;

import java.awt.*;

/**
 * This is an example, showing how to use override BaseFrame and create a simple new Frame.
 */
public class ChildFrame extends BaseFrame {

    protected void addComponents() {
        add(new Label("This is a child window."));
    }
}
