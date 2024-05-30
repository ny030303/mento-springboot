package com.example.project6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private MyService myService;


    @Test
    void testService() {
        String result = myService.performAction();
        assertThat(result).isEqualTo("expected result");
    }
}
