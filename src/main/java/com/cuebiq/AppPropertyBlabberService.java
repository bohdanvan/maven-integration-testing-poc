package com.cuebiq;

import com.cuebiq.util.AppProperties;

/**
 * @author bvanchuhov
 */
public class AppPropertyBlabberService implements BlabberService {

    @Override
    public String blab() {
        return AppProperties.INSTANCE.getString("bla");
    }
}
