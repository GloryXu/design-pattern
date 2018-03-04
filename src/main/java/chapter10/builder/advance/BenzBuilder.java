package chapter10.builder.advance;

import chapter10.builder.BenzModel;
import chapter10.builder.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.benz;
    }
}
