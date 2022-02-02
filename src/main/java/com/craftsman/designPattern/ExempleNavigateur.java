package com.craftsman.designPattern;

import com.craftsman.designPattern.impl.PublicTransportStrategy;
import com.craftsman.designPattern.impl.RoadStrategy;
import com.craftsman.designPattern.impl.WalkingStrategy;

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
