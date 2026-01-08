package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class Game extends Canvas {

    // Array of balls
    Ball[] balls = new Ball[4];

    // Game constructor
    public Game() {
        JFrame frame = new JFrame("Bouncing Balls");
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        // Set the world dimensions for all balls
        Ball.setWorld(300, 300);

        // Create three balls
        balls[0] = new Ball(50, 50, 20, 20);
        balls[1] = new Ball(100, 100, 30, 30, 6, 2); // custom speed
        balls[2] = new Ball(150, 150, 25, 25, -4, -2);
        balls[3] = new Ball(200, 200, 50, 50, 3, 5);

        // Timer to refresh the screen every 50ms
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };
        t.schedule(tt, 0, 50);

        // Stop timer when window closes
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
                frame.dispose();
            }
        });
    }

    // Move balls and repaint
    public void draw() {
        for (Ball b : balls) {
            b.move();
        }
        this.repaint();
    }

    // Paint the world and balls
    @Override
    public void paint(Graphics g) {
        // Draw world rectangle using static fields
        g.drawRect(0, 0, Ball.worldW, Ball.worldH);

        // Draw each ball
        for (Ball b : balls) {
            g.drawOval(b.x, b.y, b.w, b.h);
        }
    }

    // Main method to start the game
    public static void main(String[] args) {
        new Game();
    }
}
