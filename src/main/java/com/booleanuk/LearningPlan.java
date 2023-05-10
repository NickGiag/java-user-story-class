package com.booleanuk;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LearningPlan {

    ArrayList<String> planItems;
    ArrayList<Integer> planCosts;
    int capacity;

    public LearningPlan() {
        planItems = new ArrayList<>();
        planCosts = new ArrayList<>();
    }
    public boolean addItem(String name, int cost) {
        if (capacity <= planItems.size()) {
            return false;
        } else {
            planItems.add(name);
            planCosts.add(cost);
            return true;
        }
    }

    public boolean removeItem(String name){
        int index = planItems.indexOf(name);
        if(index < 0){
            System.out.println("Given plan could not be found");
            return false;
        }

        planItems.remove(index);
        planCosts.remove(index);

        return true;
    }
}
