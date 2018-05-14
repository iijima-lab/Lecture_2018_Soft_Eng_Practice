/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Observable;

/**
 * ディジタルクロック
 * @author 飯島 正(iijima@ae.keio.ac.jp)
 */
public class DigitalClock extends Observable implements Runnable {

    private Calendar cal = null;

    private SimpleDateFormat dateFormat = null;
    private String currentTime = null;
    private Thread thread = null;
    private boolean running = false;

    public DigitalClock() {
        cal = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("hh時mm分ss秒");
        currentTime = dateFormat.format(cal.getTime());
        running = false;
    }

    private void changed() {
        // ---------------------------------------------------------------------
        setChanged();
        notifyObservers();
        // ---------------------------------------------------------------------
    }
    public void start() {
        if (!running) {
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }
    public void stop() {
        running = false;
    }
    public void run() {
        // ---------------------------------------------------------------------
        while (running) {
            cal = Calendar.getInstance();
            currentTime = dateFormat.format(cal.getTime());
            changed();    // イベント通知
            try {
                Thread.sleep(1000); // 3秒休止
            } catch (InterruptedException ex) {
                System.exit(1);
            }
        }
        // ---------------------------------------------------------------------
    }

    public String getCurrentTime() {
        return (currentTime);
    }
}
