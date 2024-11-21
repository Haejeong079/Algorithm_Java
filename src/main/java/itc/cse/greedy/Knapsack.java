package itc.cse.greedy;

import lombok.Value;

import java.util.Arrays;
import java.util.List;

public class Knapsack {
    private int[] unitValue;

    public static void main(String[] args) {
        Knapsack knapsack=new Knapsack();
        int []weight={5,10,20};
        int []value={50,60,140};
        int capacity=30;

        Item item1 = new Item(5, 50);
        Item item2 = new Item(10, 60);
        Item item3 = new Item(20, 140);

        List<Item> knapsackItems = Arrays.asList(item1, item2, item3);
        knapsackItems.remove(0);



        knapsack.calValue(weight,value,capacity);

    }

    private void calValue(int[] weight, int[] value, int W) {
        unitValue = new int[value.length];
        for (int i = 0; i < value.length; i++) {
            unitValue[i]=value[i]/weight[i];
        }
        int cW=0;   //물건의 무게 합
        int cV=0;   //물건의 가치 합

        int x=findMax(unitValue);

        while ((cW+weight[x]<W)){
            cW=cW+weight[x];
            cV=cV+value[x];
            unitValue[x] = -1;
            x = findMax(unitValue);
        }
        System.out.println("총합 :" + cW + " 총 가치 : " + cV);

        if((W-cW) > 0){
            cV = cV + (W -cW) * unitValue[x];
        }
        System.out.println("총 가치 : " + cV);
    }

    private int findMax(int[] unitValue) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for (int i = 0; i < unitValue.length; i++) {
            if(unitValue[i]>max) {
                max = unitValue[i];
                index = i;
            }

        }
        return index;
    }
}
