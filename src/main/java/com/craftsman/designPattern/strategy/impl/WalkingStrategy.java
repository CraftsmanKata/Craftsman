package com.craftsman.designPattern.strategy.impl;

import com.craftsman.designPattern.strategy.interfaces.RouteStrategy;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String source, String destination) {
        if(null!=source && null!=destination) {
            return source + " : " + destination + " : WalkingStrategy";
        }
        return "No Route";
    }
}
