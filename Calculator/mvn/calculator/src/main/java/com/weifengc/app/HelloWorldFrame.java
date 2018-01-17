package com.weifengc.app;

import java.awt.*;

/**
 * This is a "window" with just hello world label.
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI.html
 */
public class HelloWorldFrame extends Frame{
    private Label label;

    public HelloWorldFrame(){
        //Call super method, setLayout
        setLayout(new FlowLayout());

        //create a label instance
        label = new Label("Hello World");

        //add is a super method.
        add(label);

        setTitle("Hello World Window");
        // You have to set a size, or you can't really see the text label.
        setSize(250, 100);
        // You need to set visible to true.
        setVisible(true);
    }

}
