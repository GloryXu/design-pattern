package other.observe.newjava9;

import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class SampleSubscriber<T> implements Flow.Subscriber<T> {
    final Consumer<? super T> consumer;
    Flow.Subscription subscription;
    final long bufferSize;
    long count;

    SampleSubscriber(long bufferSize, Consumer<? super T> consumer) {
        this.bufferSize = bufferSize;
        this.consumer = consumer;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        long initialRequestSize = bufferSize;
        count = bufferSize - bufferSize / 2; // re-request when half consumed
        (this.subscription = subscription).request(initialRequestSize);
    }

    @Override
    public void onNext(T item) {
        if (--count <= 0)
            subscription.request(count = bufferSize - bufferSize / 2);
        consumer.accept(item);
    }

    @Override
    public void onError(Throwable ex) {
        ex.printStackTrace();
    }

    @Override
    public void onComplete() {
    }
}
