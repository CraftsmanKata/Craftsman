package com.craftsman.designPattern;


import com.craftsman.designPattern.impl.WalkingStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextTest {

    @Test
    void TestBuildRouteSourceIsNull() {
        Context context = new Context();
        context.setRouteStrategy(new WalkingStrategy());

        Assertions.assertEquals(context.buildRoute(null,"Paris"), "No Route");

    }

    @Test
    void TestBuildRouteDestinationIsNull() {
        Context context = new Context();
        context.setRouteStrategy(new WalkingStrategy());

        Assertions.assertEquals(context.buildRoute("Annecy",null), "No Route");
    }

    @Test
    void TestBuildRoute() {
        Context context = new Context();
        context.setRouteStrategy(new WalkingStrategy());

        Assertions.assertEquals(context.buildRoute("Annecy","Paris"), "Annecy : Paris : WalkingStrategy");
    }
}