package other.observe.newjava9;

public class Main {
    public static void main(String[] args) {
        OneShotPublisher oneShotPublisher = new OneShotPublisher();

        SampleConsumer sampleConsumer = new SampleConsumer();
        SampleSubscriber<Boolean> sampleSubscriber = new SampleSubscriber<>(10, sampleConsumer);
        oneShotPublisher.subscribe(sampleSubscriber);

        UnboundedSubscriber<Boolean> unboundedSubscriber = new UnboundedSubscriber<>();
        unboundedSubscriber.onSubscribe(sampleSubscriber.subscription);
    }
}
