package guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.security.Key;
import java.util.concurrent.TimeUnit;

/**
 * Created by zshen on 4/28/16.
 */
public class Example {
    LoadingCache<Key, Graph> graphs = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .removalListener(null)
            .build(
                    new CacheLoader<Key, Graph>() {
                        public Graph load(Key key) throws Exception {
                            return null;
                        }
                    });
}
