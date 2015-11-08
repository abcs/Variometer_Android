package eu.ablonczy.csaba.variometer;

import java.util.Comparator;

/**
 * Created by ecsaabl on 2015.10.18..
 */
public class FlyingResponseComp implements Comparator<MainActivity.FlyingResponse> {

    @Override
    public int compare(MainActivity.FlyingResponse e1, MainActivity.FlyingResponse e2) {
        return e1.altitude.compareTo(e2.altitude);
    }
}
