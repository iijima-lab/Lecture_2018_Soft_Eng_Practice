/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_clock.controller;

import digital_clock.model.DigitalClock;
import digital_clock.view.DigitalClockControlPanel;
import digital_clock.view.DigitalClockView;

/**
 * ディジタルクロック
 *
 * @author 飯島 正(iijima@ae.keio.ac.jp)
 */
public class DigitalClockController {

    private DigitalClock clock = null;
    private DigitalClockView view = null;
    private DigitalClockControlPanel controlPanel = null;

    public DigitalClockController(DigitalClock clock,
            DigitalClockView view,
            DigitalClockControlPanel controlPanel) {
        this.clock = clock;
        this.view = view;
        this.controlPanel = controlPanel;
    }


    public void start() {
        clock.start();
    }

    public void stop() {
        clock.stop();
    }

    public void exit() {
        System.exit(0);
    }
}
