package examples.j19;

import examples.j14.Person;

import java.time.LocalDate;
import java.util.Optional;

public class PatternMatchingWithRecords {

    public static Optional<String> getName(Object user){

        if (user instanceof Person(String firstName, String lastName, LocalDate dob)){
            return Optional.of("%s %s".formatted(firstName, lastName));
        }
        return Optional.empty();
    }
}
