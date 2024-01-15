package examples.j16;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StreamToListTest {
    @Test
    void shouldReturnAsList() {
        var input = List.of(1,2,3,4);
        var output = StreamToList.get(input);

        assertThat(input).hasSameElementsAs(input);
    }
}