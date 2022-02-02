package com.craftsman.designPattern;

import com.craftsman.designPattern.interfaces.RouteStrategy;

public class Context {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy strategy){
        this.routeStrategy = strategy;
    }

    public String buildRoute(String source,String destination){
       return routeStrategy.buildRoute(source,destination);
    }
}
