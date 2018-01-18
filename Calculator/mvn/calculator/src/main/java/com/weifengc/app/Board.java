package com.weifengc.app;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Board extends Frame {
    private int width = 400;
    private int height = 300;
    private LayoutManager layout = new FlowLayout();
    private String title = "Board";
    private int result = 0;

    StringBuilder stringBuilder = new StringBuilder();

    void updateBoard(ButtonFactory.CalButton button) {
        if (button instanceof ButtonFactory.OpeButton) {
            stringBuilder.append(((ButtonFactory.OpeButton) button).getOperation().label);
            if (((ButtonFactory.OpeButton) button).getOperation().equals(ButtonFactory.Operation.EQUAL)) {
                //calculate the result
                result = calculateResult();
            }
        } else if (button instanceof ButtonFactory.NumButton) {
            stringBuilder.append(((ButtonFactory.NumButton) button).getNumber());
        } else {
        }

        //show stringBuilder
        Utils.log(stringBuilder.toString());
    }

    /**
     * Caculate result according to the stringBuilder
     */
    private int calculateResult() {
        //TODO : calculate the result from string builder.

        int len = stringBuilder.length();
        int num = 0;
        char ope = '+';
        int res = 0;
        for (int i = 0; i < len; i++) {
            char c = stringBuilder.charAt(i);
            //Utils.log("c : " + c);
            if (c <= '9' && c >= '0') {
                num = num * 10 + (c - '0');
                //Utils.log("num is :" + num);
            } else {
                switch (ope) {
                    case '+': {
                        res = res + num;
                        break;
                    }
                    case '-': {
                        res = res - num;
                        break;
                    }
                    case '*': {
                        res = res * num;
                        break;
                    }
                    case '/': {
                        res = res / num;
                        break;
                    }
                }
                num = 0;
                ope = c;
            }
        }

        Utils.log("Result is :" + res);
        this.stringBuilder = new StringBuilder();
        return res;
    }

    public Board() {
        addComponents();
        init();
    }

    private void addComponents() {
        for (int i = 0; i < 10; i++) {
            add(ButtonFactory.createNumButton(this, i));
        }

        for (ButtonFactory.Operation operation : ButtonFactory.Operation.values()) {
            add(ButtonFactory.createOpeButton(this, operation));
        }
    }

    private void init() {
        setLayout(layout);
        setTitle(title);
        setSize(width, height);
        setVisible(true);

        addWindowListener(new WindowListener() {
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
        });
    }

}
