package examples.j14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelpfulNPETest {

    Person p;
    @Test
    void shouldProvideHelpfulNPE() {
        var thrown = assertThrows(NullPointerException.class, () -> p.dateOfBirth(), "xampes.j14.Person.dateOfBirth()\" because \"this.p\" is null");

    }
}
