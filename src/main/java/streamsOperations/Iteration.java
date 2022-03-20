package streamsOperations;

import java.util.Arrays;
import java.util.List;

/**
 * For each of list can be replaced with streams
 */
public class Iteration {


    public void loopWithForEach() {
        List<String> vals = Arrays.asList("a", "b", "c");
        for(String val : vals) {
            System.out.println(val);
        }
    }

    public void loopWithStreams() {
        List<String> vals = Arrays.asList("a", "b", "c");
        vals.stream().forEach(System.out::println);
    }
}
