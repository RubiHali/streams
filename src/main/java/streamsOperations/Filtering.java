package streamsOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Filter to create a new stream
 */
public class Filtering {


    public void useFilterOnStreams() {
        List<String> values = Arrays.asList("One", "OneAndOnly", "Derek", "Change", "factory", "justBefore", "Italy", "Italy", "Thursday", "", "");
        Stream<String> streams = values.stream().filter(x -> x.contains("d"));
    }
}
