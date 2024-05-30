package com.example.project6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class ExampleTest {
    @Test
    void testMethod() {
        int expected = 42;
        int actual = Example.methodToTest();
        assertEquals(expected, actual);
    }

    @Test
    void testWithMock() {
        MyService myService = mock(MyService.class);
        when(myService.performAction()).thenReturn("mocked response");

        String result = myService.performAction();
        assertEquals("mocked response", result);
    }
}
