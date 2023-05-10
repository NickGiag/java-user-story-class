## User Stories

1. As a student of the Academy I want to be able to add a specific item to my Learning Plan.

2. As a student of the Academy if I change my mind I want to be able to remove a item from my Learning Plan.

3. As a student of the Academy I'd like to know when my Learning plan is full, when I try to add another item (Course, Tutorial, Certification) to it.

4. As a manager at the Academy, I'd like to be able to change the capacity of Learning Plans.

5. As a student of the Academy, I'd like to know that if I try to remove an item that doesn't exist in my Learning Plan.

## Domain Model

**LearningPlan**

| Members/Attributes/Fields      | Methods                         | Scenarios                                                                                  | Outcomes/Outputs                                                                                |
|--------------------------------|---------------------------------|--------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| `ArrayList<String> planItems`  |                                 |                                                                                            |                                                                                                 |
| `ArrayList<Integer> planCosts` |                                 |                                                                                            |                                                                                                 |
| int capacity                   |                                 |                                                                                            |                                                                                                 |
|                                | addItem(Item)                   | 1 Successfully add a specific item to the plan                                             | Item name is added to the planItems List and Cost is added to the planCosts List, true returned |
|                                |                                 | 3 Item cannot be added to the lists                                                        | Return false/ouput a failure message                                                            |
|                                | removeItem(Item)                | 2 Successfully remove a specific item from the plan                                        | Return true, update planItems and planCosts to remove the values                                |
|                                |                                 | 5 Cannot remove item as it doesn't exist in the plan                                       | Return false/output a failure message                                                           |
|                                | updateCapacity(int newCapacity) | 4 Change the value of capacity                                                             | Return true if capacity is changed successfully.                                                |
|                                |                                 |                                                                                            | Return false if attempt to change to 0 or negative.                                             |
|                                |                                 | If updating capacity would mean there were more items in the plan than the capacity allows | Return false and output a message                                                               |