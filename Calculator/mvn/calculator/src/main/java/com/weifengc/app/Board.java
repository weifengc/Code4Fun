package com.weifengc.app;

import java.awt.*;

public class Board extends Frame {
    private int width = 400;
    private int height = 300;
    private LayoutManager layout = new FlowLayout();
    private String title = "Board";


    void updateBoard(ButtonFactory.CalButton button) {
        if (button instanceof ButtonFactory.OpeButton) {
            Utils.log("Clicked on a OpeButton!");
        } else if (button instanceof ButtonFactory.NumButton) {
            Utils.log("Clicked on a NumButton");
        } else {
        }
    }

    public Board() {
        addComponents();
        init();
    }

    private void addComponents() {
        for (int i = 0; i < 10; i++) {
            add(ButtonFactory.createNumButton(this, i));
        }

        for(ButtonFactory.Operation operation : ButtonFactory.Operation.values()){
            add(ButtonFactory.createOpeButton(this, operation));
        }
    }

    private void init() {
        setLayout(layout);
        setTitle(title);
        setSize(width, height);
        setVisible(true);
    }

}
