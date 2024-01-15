package examples.j14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class PatternMatchingInstanceOfTest {

    @InjectMocks PatternMatchingInstanceOf subject;

    @Test
    void should() {
        Optional<Integer> maybeLen = subject.lenIfString("mike");
        assertThat(maybeLen).isPresent();
        assertThat(maybeLen).contains(4);

        subject.lenIfString( 1).isEmpty();
    }
}