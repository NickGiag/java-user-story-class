package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LearningPlanTest {

    @Test
    public void addItemReturnsTrueOnSuccessAndBothListsArePopulated(){

        LearningPlan learningPlan = new LearningPlan();
        String item = "Java Introduction";
        int itemPrice = 20;

        Assertions.assertTrue(learningPlan.addItem(item, itemPrice));
        Assertions.assertEquals(item, learningPlan.planItems.get(0));
        Assertions.assertEquals(itemPrice, learningPlan.planCosts.get(0));


    }
}
