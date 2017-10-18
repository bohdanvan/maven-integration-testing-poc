package com.cuebiq;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author bvanchuhov
 */
public class AppPropertyBlabberServiceTest {

    @Test
    public void testBlab() {
        BlabberService blabberService = new AppPropertyBlabberService();
        assertThat(blabberService.blab(), is("unit-test"));
    }
}
