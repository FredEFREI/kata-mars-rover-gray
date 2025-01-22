## Feature: Moving forward

| Scenario     | Initial position | Expected position  |
|--------------|:----------------:|:------------------:|
| Facing North |      (4, 2)      |       (4, 3)       |
| Facing East  |      (4, 2)      |       (5, 2)       |
| Facing West  |      (4, 2)      |       (3, 2)       |
| Facing South |      (4, 2)      |       (4, 1)       |



## Feature: Moving backward

| Scenario     | Initial position | Expected position |
|--------------|:----------------:|:-----------------:|
| Facing North |      (4, 2)      |      (4, 1)       |
| Facing East  |      (4, 2)      |      (3, 2)       |
| Facing West  |      (4, 2)      |      (5, 2)       |
| Facing South |      (4, 2)      |      (4, 3)       |

## Feature: Turn Left
| Scenario     | Expected direction | 
|--------------|:------------------:|
| Facing North |        WEST        | 
| Facing East  |       NORTH        | 
| Facing West  |       SOUTH        |
| Facing South |        EAST        | 

## Feature: Turn Right
| Scenario     | Expected direction | 
|--------------|:------------------:|
| Facing North |        EAST        | 
| Facing East  |       SOUTH        | 
| Facing West  |       NORTH        |
| Facing South |        WEST        | 
