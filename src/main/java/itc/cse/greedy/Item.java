package itc.cse.greedy;

import lombok.Data;

@Data

public class Item {
    private int weight;
    private int value;
    private double unitValue;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.unitValue = value / weight;
    }
}
