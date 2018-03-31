package other.observe.newjava9;

import java.util.function.Consumer;

public class SampleConsumer implements Consumer<Boolean> {

    @Override
    public void accept(Boolean s) {
        System.out.println("SampleConsumer " + s);
    }
}
