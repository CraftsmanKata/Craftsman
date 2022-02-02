package com.craftsman.designPattern.impl;

import com.craftsman.designPattern.interfaces.RouteStrategy;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String source, String destination) {
        return source +" : "+destination+" : WalkingStrategy ";
    }
}
