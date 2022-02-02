package com.craftsman.designPattern.impl;

import com.craftsman.designPattern.interfaces.RouteStrategy;

public class RoadStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String source, String destination) {
        if(null!=source && null!=destination) {
            return source + " : " + destination + " : RoadStrategy ";
        }
        return "No Route";
    }
}
