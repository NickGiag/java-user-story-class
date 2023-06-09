package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LearningPlanTest {

    @Test
    public void addItemReturnsTrueOnSuccessAndBothListsArePopulated(){

        LearningPlan learningPlan = new LearningPlan();
        learningPlan.capacity = 1;
        String item = "Java Introduction";
        int itemPrice = 20;

        Assertions.assertTrue(learningPlan.addItem(item, itemPrice));
        Assertions.assertEquals(item, learningPlan.planItems.get(0));
        Assertions.assertEquals(itemPrice, learningPlan.planCosts.get(0));


    }

    @Test
    public void addItemReturnsFalse() {
        LearningPlan learningPlan = new LearningPlan();
        learningPlan.capacity = 1;
        String item = "Java Introduction";
        int itemPrice = 20;
        learningPlan.addItem(item, itemPrice);

        Assertions.assertFalse(learningPlan.addItem(item, itemPrice));

    }

    @Test
    public void removeItemShouldReturnTrueAndRemovedFromBothLists() {
        LearningPlan learningPlan = new LearningPlan();
        learningPlan.capacity = 1;
        String item = "Java Introduction";
        int itemPrice = 20;
        learningPlan.addItem(item, itemPrice);



        Assertions.assertTrue(learningPlan.removeItem(item));
        Assertions.assertEquals(0, learningPlan.planItems.size());
        Assertions.assertEquals(0, learningPlan.planCosts.size());

    }

    @Test
    public void removeItemShouldReturnFalse() {
        LearningPlan learningPlan = new LearningPlan();
        learningPlan.capacity = 1;


        Assertions.assertFalse(learningPlan.removeItem("item"));
    }
}
