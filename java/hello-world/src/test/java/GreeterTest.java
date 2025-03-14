import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        new Greeter();
        assertThat(Greeter.getGreeting()).isEqualTo("Hello, World!");
    }

}
