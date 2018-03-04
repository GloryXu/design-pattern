package builder.advance;

import builder.BMWModel;
import builder.CarModel;

import java.util.ArrayList;

/**
 * 给定一个顺序，返回一个宝马车
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    public CarModel getCarModel() {
        return this.bmw;
    }
}
