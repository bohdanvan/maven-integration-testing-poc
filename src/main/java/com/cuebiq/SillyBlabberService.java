package com.cuebiq;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author bvanchuhov
 */
public class SillyBlabberService implements BlabberService {

    public String blab() {
        sleep(SECONDS.toMillis(2));
        return "OK";
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
