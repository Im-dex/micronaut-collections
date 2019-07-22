package collections;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Client("/test")
public interface TestClient {
    @Get("/list")
    List<Long> list(@QueryValue("items") List<Long> items);

    @Get("/set")
    Set<Long> set(@QueryValue("items") Set<Long> items);

    @Get("/collection")
    Collection<Long> collection(@QueryValue("items") Collection<Long> items);
}
