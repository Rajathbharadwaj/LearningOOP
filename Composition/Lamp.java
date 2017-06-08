package com.Composition;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by BIC on 6/6/2017.
 */
public class Lamp {

    private String style;
    private  boolean battery;
    private  int powerrating;


    public Lamp(String style, boolean battery, int powerrating) {
        this.style = style;
        this.battery = battery;
        this.powerrating = powerrating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getPowerrating() {
        return powerrating;
    }

    public void turnON() {
        System.out.println("turning On");

    }


}
