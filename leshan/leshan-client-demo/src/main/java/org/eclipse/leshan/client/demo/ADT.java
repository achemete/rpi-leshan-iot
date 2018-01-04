package org.eclipse.leshan.client.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.eclipse.leshan.client.resource.BaseInstanceEnabler;
import org.eclipse.leshan.core.response.ExecuteResponse;
import org.eclipse.leshan.core.response.ReadResponse;
import org.eclipse.leshan.util.NamedThreadFactory;

public class ADT extends BaseInstanceEnabler {

    private static final int TEXT_VALUE = 5527;
    private static final int MAX_X_COORDINATE = 5545;
    private static final int MAX_Y_COORDINATE = 5546;
    //private final ScheduledExecutorService scheduler;

/*    public ADT() {
        this.scheduler = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("Temperature Sensor"));
        scheduler.scheduleAtFixedRate(new Runnable() {

            @Override
            public void run() {
                adjustTemperature();
            }
        }, 2, 2, TimeUnit.SECONDS);
    }
*/
    @Override
    public synchronized ReadResponse read(int resourceId) {
        switch (resourceId) {
        case TEXT_VALUE:
            return ReadResponse.success(resourceId, "Text");
        case MAX_X_COORDINATE:
            return ReadResponse.success(resourceId, "X COORDINATE");
        case MAX_Y_COORDINATE:
            return ReadResponse.success(resourceId, "Y COORDINATE");
        default:
            return super.read(resourceId);
        }
    }
}
