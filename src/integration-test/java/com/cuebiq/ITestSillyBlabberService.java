package com.cuebiq;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author bvanchuhov
 */
public class ITestSillyBlabberService {

    @Test
    public void testSillyBlab() {
        BlabberService blabberService = new SillyBlabberService();
        assertThat(blabberService.blab(), is("OK"));
    }
}