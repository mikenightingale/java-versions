package examples.j14;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SwitchExpressionTest {

    @InjectMocks SwitchExpression subject;

    @Test
    void testOldSwitch() {
        assertThat(subject.isWorkingDay("MONDAY")).isTrue();
        assertThat(subject.isWorkingDay("SUNDAY")).isFalse();
    }

    @Test
    void testSwitchExpression() {
        assertThat(subject.isWorkingDayNew("MONDAY")).isTrue();
        assertThat(subject.isWorkingDayNew("SUNDAY")).isFalse();
    }
}