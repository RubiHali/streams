package streamsCreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Create streams from existing sources
 */
public class CreateStream {

    /**
     * Create streams from existing sources using stream()method
     */
    public Stream<String> createStreamWithStream() {
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        return stream;
    }

    /**
     * Create streams from existing sources using of() method
     */
    public Stream<String> createStreamWithOf() {
        String[] arr = new String[]{"a", "b", "c"};
        return Stream.of(arr);
    }

    /**
     * Create streams from existing sources using stream() method on collection
     */
    public Stream<String> createStreamWithCollectionStream() {
        List<String> streamCollect = Arrays.asList("a", "b", "c");
        return streamCollect.stream();
    }

    /**
     * Create streams from existing sources using parallelStream() method on collection
     */
    public Stream<String> createStreamWithParallelStream() {
        List<String> streamCollect = Arrays.asList("a", "b", "c");
        return streamCollect.parallelStream();
    }
}
