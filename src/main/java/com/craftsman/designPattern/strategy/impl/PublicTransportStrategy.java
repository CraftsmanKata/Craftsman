package com.craftsman.designPattern.strategy.impl;

import com.craftsman.designPattern.strategy.interfaces.RouteStrategy;

public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String source, String destination) {
        if(null!=source && null!=destination){
            return source +" : "+destination+" : PublicTransportStrategy";
        }
         return "No route";
    }
}
