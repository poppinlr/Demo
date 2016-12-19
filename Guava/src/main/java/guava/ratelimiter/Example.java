package guava.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;

import java.util.List;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zshen on 6/15/16.
 */
public class Example {
    final RateLimiter rateLimiter = RateLimiter.create(2);
    final RateLimiter rateLimiter2 = RateLimiter.create(2,1, TimeUnit.SECONDS);

    public void submitTasks(List<Runnable> tasks, Executor executor){
        for (Runnable task : tasks){
            rateLimiter.acquire();
            System.out.println("get acquired");
        }
    }

    public void Example(){
        if (rateLimiter.tryAcquire()) {
            return ;
        } else {
            System.out.println("get acquired");
        }

    }
}
