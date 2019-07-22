package collections;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@MicronautTest
class SimpleTest {
    @Inject
    TestClient client;

    @Test
    void testList() {
        assertEquals(List.of(1L, 2L, 3L), client.list(List.of(1L, 2L, 3L)));
    }

    @Test
    void testSet() {
        assertEquals(Set.of(1L, 2L, 3L), client.set(Set.of(1L, 2L, 3L)));
    }

    @Test
    void testCollection() {
        assertIterableEquals(List.of(1L, 2L, 3L), client.collection(List.of(1L, 2L, 3L)));
    }
}
