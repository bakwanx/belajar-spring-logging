package belajarloggin.belajarspringlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LogginTest {

    @Test
    void testLongLogging() {
        for (int i = 0; i < 100.000; i++) {
            log.warn("Hello world {}", i);
        }
    }

    @Test
    void testLog() {
        log.info("Belajar Java");
        log.warn("Peringatan gaes");
        log.error("Error gaes");
    }
}
