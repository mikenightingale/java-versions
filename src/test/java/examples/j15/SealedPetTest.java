package examples.j15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SealedPetTest {
    @Test
    void shouldAllowExclusiveSwitch() {

        var dog = new Dog();
        assertThat(dog.isBestPed(dog)).isTrue();
    }
}