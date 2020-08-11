package dev.graciano.badge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class GreetingTest {

    @Autowired
    Greeting greeting;

    @Test
    public void sayHelloTest() {
        assertEquals("Hello", greeting.sayHello());
    }
}
