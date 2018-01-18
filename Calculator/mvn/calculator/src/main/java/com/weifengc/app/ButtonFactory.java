package com.weifengc.app;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * This is where you can create buttons.
 * Calling createNumButton to create buttons for number.
 * Calling createOpeButton to create buttons for Operation.
 */
public class ButtonFactory {
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    private ButtonFactory() {
    }

    public static NumButton createNumButton(Board board, int number) {
        return new NumButton(board, number);
    }

    public static OpeButton createOpeButton(Board board, Operation operation) {
        return new OpeButton(board, operation);
    }


    static abstract class CalButton extends Button {
        protected Board board;

        void buttonClick() {
            board.updateBoard(this);
        }


        private CalButton(Board board) {
            this.board = board;
            addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    buttonClick();
                }

                public void mousePressed(MouseEvent e) {

                }

                public void mouseReleased(MouseEvent e) {

                }

                public void mouseEntered(MouseEvent e) {

                }

                public void mouseExited(MouseEvent e) {

                }
            });
        }
    }

    static class NumButton extends CalButton {
        private int number;

        private NumButton(Board board, int number) {
            super(board);
            this.number = number;
            setLabel(number + "");
        }
    }

    static class OpeButton extends CalButton {
        private Operation operation;

        private OpeButton(Board board, Operation operation) {
            super(board);
            this.operation = operation;
            String label = "";
            switch (operation) {
                case PLUS: {
                    label = "+";
                    break;
                }
                case MINUS: {
                    label = "-";
                    break;
                }
                case TIMES: {
                    label = "*";
                    break;
                }
                case DIVIDE: {
                    label = "/";
                    break;
                }
            }
            setLabel(label);
        }

    }
}




