package com.cuebiq;

/**
 * @author bvanchuhov
 */
public class SillyBlabberService implements BlabberService {

    public String blab() {
        sleep(5000);
        return "OK";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
