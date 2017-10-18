package com.cuebiq;

/**
 * @author bvanchuhov
 */
public class TextBlabberService implements BlabberService {
    
    private final String text;

    public TextBlabberService(String text) {
        this.text = text;
    }

    public String blab() {
        return text;
    }
}
