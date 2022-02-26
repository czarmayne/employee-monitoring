/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.b2b.employee.monitoring

import com.b2b.employee.monitoring.presentation.rest.OvertimeController
import org.junit.jupiter.api.Test
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class AppTest extends Specification {
    @Autowired
    private OvertimeController overtimeController;

    @Test
    void contextLoads() throws Exception {
        assertThat(overtimeController).isNotNull()
    }

    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
    }
}
