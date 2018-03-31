package other.observe.newjava9;

import java.util.concurrent.Flow;

public class UnboundedSubscriber<T> implements Flow.Subscriber<T> {

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscription.request(Long.MAX_VALUE); // effectively unbounded
    }

    @Override
    public void onNext(T item) {
        use(item);
    }

    @Override
    public void onError(Throwable ex) {
        ex.printStackTrace();
    }

    @Override
    public void onComplete() {
    }

    void use(T item) {
        System.out.println(item);
    }
}
