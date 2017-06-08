package com.Composition;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by BIC on 6/6/2017.
 */
public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
