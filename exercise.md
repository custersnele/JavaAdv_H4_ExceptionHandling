## Virtual Pet Care Game with Exception Handling

### Objective:
In this exercise, you will create a **virtual pet care game** where players feed and play with a pet. The pet has energy that increases when fed and decreases when playing. Incorrect actions—such as feeding the pet harmful food or trying to play when the pet is too tired—will throw exceptions that must be handled appropriately.

You will also create a Pet class to manage the pet’s energy and state, which can be tested later.

### Classes to Implement:

- **PetTiredException**: A checked exception that will be thrown when the pet is too tired to play.
- **WrongFoodException**: An unchecked exception that will be thrown when the player tries to feed the pet harmful food.
- **Pet**: A class representing the pet, with attributes and methods to manage its energy levels, feeding, and playing.
- **PetGame**: A class containing the game logic, allowing players to interact with their pet by feeding or playing with it. Exceptions will be handled here.

### Step-by-Step Instructions:
#### Step 1: Create the PetTiredException Class

This is a checked exception that will be thrown when the pet's energy level is too low for playing. The player will be notified that the pet is too tired.

#### Step 2: Create the WrongFoodException Class
This is an unchecked exception that will be thrown when the player tries to feed the pet harmful food (e.g., chocolate). It should extend RuntimeException.


#### Step 3: Create the Pet Class
The Pet class will encapsulate the pet’s state and behavior, such as its energy. The energy level increases when the pet is fed and decreases when the pet plays. The class will throw exceptions when appropriate, such as when the pet is fed harmful food or when it is too tired to play.

**Attributes:**
- **energy**: An integer representing the pet's energy level (from 0 to 100).

**Methods:**

- **feed(String food)**: Increases the pet’s energy level with 20 when given safe food. If harmful food is fed (e.g., "chocolate"), throw a WrongFoodException.
- **play()**: Decreases the pet’s energy level with 30. If the pet's energy is too low (below 20), throw a PetTiredException.
- **getEnergy()**: Returns the pet's current energy level.
- **toString()**: to display the pet's status (its energy level).

#### Step 4: Implement the PetGame Class
This class will contain the game logic, allowing the player to interact with the pet by feeding and playing with it. The player's actions will affect the pet’s energy, and exceptions must be handled when appropriate.

Create a Pet object.
Start with a default energy level of 100.

Continuously prompt the player to either feed or play with the pet, or exit the game.
If the player chooses to feed the pet, they enter the food type. If harmful food is provided, a WrongFoodException is thrown.
If the player chooses to play with the pet and the pet is too tired (energy < 20), a PetTiredException is thrown.
After each action, display the pet's current energy level.
