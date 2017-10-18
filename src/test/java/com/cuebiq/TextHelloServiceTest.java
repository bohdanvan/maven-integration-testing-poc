package com.cuebiq;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author bvanchuhov
 */
public class TextHelloServiceTest {

    @Test
    public void testBlab() {
        String text = "Java";
        BlabberService blabberService = new TextBlabberService(text);
        assertThat(blabberService.blab(), is(text));
    }
}