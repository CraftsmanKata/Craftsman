package com.craftsman.designPattern.impl;

import com.craftsman.designPattern.interfaces.RouteStrategy;

public class PublicTransportStrategy implements RouteStrategy {

    @Override
    public String buildRoute(String source, String destination) {
         return source +" : "+destination+" : PublicTransportStrategy ";
    }
}
