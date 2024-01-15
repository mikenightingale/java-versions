package examples.j14;

import java.util.Optional;

public class PatternMatchingInstanceOf {

    public Optional<Integer> lenIfString(Object in){
        if (in instanceof String out){
            return Optional.of(out.length());
        }

        return Optional.empty();
    }

}
