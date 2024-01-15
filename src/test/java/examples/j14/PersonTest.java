package examples.j14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


class PersonTest {

    public static final LocalDate DATE_OF_BIRTH = LocalDate.of(1973, 9, 16);
    public static final int HASH = -712901593;
    private Person subject;

    @BeforeEach
    void setUp() {
        subject = new Person("Michael", "Nightingale", DATE_OF_BIRTH);
    }

    @Test
    void shouldConstructPerson() {
        assertThat(subject.firstName()).isEqualTo("Michael");
        assertThat(subject.lastName()).isEqualTo("Nightingale");
        assertThat(subject.dateOfBirth()).isEqualTo(DATE_OF_BIRTH);
        assertThat(subject.hashCode()).isEqualTo(HASH);
    }
}