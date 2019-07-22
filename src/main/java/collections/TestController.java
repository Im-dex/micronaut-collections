package collections;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Controller("/test")
public class TestController {
    @Get("/list")
    public List<Long> list(@QueryValue("items") List<Long> items) {
        return items;
    }

    @Get("/set")
    public Set<Long> set(@QueryValue("items") Set<Long> items) {
        return items;
    }

    @Get("/collection")
    public Collection<Long> collection(@QueryValue("items") Collection<Long> items) {
        return items;
    }
}
