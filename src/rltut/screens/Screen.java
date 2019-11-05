package rltut.screens;

import java.awt.event.KeyEvent;

import asciipanel.src.main.java.asciiPanel.AsciiPanel;

public interface Screen {
    public void displayOutput(AsciiPanel terminal);

    public Screen respondToUserInput(KeyEvent key);
}