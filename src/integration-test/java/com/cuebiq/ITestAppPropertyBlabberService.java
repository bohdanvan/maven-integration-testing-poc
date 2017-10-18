package com.cuebiq;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author bvanchuhov
 */
public class ITestAppPropertyBlabberService {

    @Test
    public void testBlab() {
        BlabberService blabberService = new AppPropertyBlabberService();
        assertThat(blabberService.blab(), is("integration-test"));
    }
}
