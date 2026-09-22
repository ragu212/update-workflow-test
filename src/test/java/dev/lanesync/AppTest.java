package dev.lanesync;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Feat_{{SAMPLE_FEATURE_ISSUE}}_GreeterTest {
    private final App app = new App();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void greetsByName() {
        assertEquals("Hello, World!", app.greet("World"));
    }
}
