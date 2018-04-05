package jp.urgm.sample.collectors;

import static jp.urgm.collectors.Collectors0.*;

import java.util.Optional;
import java.util.stream.Stream;

public class CollectorsSample {

    public static void main(final String[] args) {
        final Optional<String> first = Stream
                .of("foo", "bar", "baz")
                .collect(findFirst());
        System.out.println(first);
    }
}
