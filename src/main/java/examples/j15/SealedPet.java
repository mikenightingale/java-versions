package examples.j15;

public abstract sealed class SealedPet
        permits Dog, Cat, Rabbit {
    public boolean isBestPed(SealedPet pet){
        return switch (pet) {
            case Cat c  -> false;
            case Rabbit r  -> false;
            case Dog d -> true;
        };
    }
}

final class Dog extends SealedPet {
}
final class Cat extends SealedPet {
}
final class Rabbit extends SealedPet {
}
