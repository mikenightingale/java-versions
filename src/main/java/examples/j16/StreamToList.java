package examples.j16;

import java.util.Collection;
import java.util.List;

public class StreamToList {

    public static <T> List<T> get(Collection<T> in) {
        return in.stream().toList();
    }
}
