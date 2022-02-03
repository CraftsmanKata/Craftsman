package com.craftsman.designPattern.strategy;

import com.craftsman.designPattern.strategy.impl.PublicTransportStrategy;
import com.craftsman.designPattern.strategy.impl.RoadStrategy;
import com.craftsman.designPattern.strategy.impl.WalkingStrategy;

public class ExempleNavigateur {

    public static void main(String Args[]){
        Context context = new Context();
        String source = "Paris";
        String destination = "Annecy";

        String Choix = "Road";

        if (Choix == "PublicTransport"){
            context.setRouteStrategy(new PublicTransportStrategy());
        }else if(Choix == "Road"){
            context.setRouteStrategy(new RoadStrategy());
        }else if(Choix == "Walking"){
            context.setRouteStrategy(new WalkingStrategy());
        }

        String resultat = context.buildRoute(source,destination);
        System.out.println(resultat);
    }
}
