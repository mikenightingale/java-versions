package examples.j19;

import examples.j14.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PatternMatchingWithRecordsTest {

    @Test
    void shouldGetName() {
        Optional<String> name = PatternMatchingWithRecords.getName(new Person("Michael", "Nightingale", LocalDate.of(1973, 9, 16)));
        assertThat(name).isPresent();
        assertThat(name.orElseGet(() -> "Not found")).isEqualTo("Michael Nightingale");
    }

    @Test
    void shouldBeEmpty() {
        Optional<String> name = PatternMatchingWithRecords.getName(null);
        assertThat(name).isEmpty();
    }
}