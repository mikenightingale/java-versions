package examples.j17;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;


class RandomNumbersTest {

    @Test
    void shouldReturnIntStream() {
        IntStream intStream = RandomNumbers.get(10);
        assertThat(intStream.count()).isEqualTo(10);
    }
}