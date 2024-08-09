# ALGO-BIG PROJECT
 
 (A) OBJECT-ORIENTED PRINCIPLES
# Encapsulation:
 Encapsulation is the bundling of data and methods that operate on that data within one unit, typically a class.

# Implementation:
Each class (e.g., Card, Deck, Player, Dealer, Game) encapsulates its attributes and behaviors. For example, the Card class encapsulates the suit, rank, and value of a card and provides methods to access these properties (getValue() and toString()).

The internal state of each class is kept private, and access is provided via public methods.

# Abstraction:
 Abstraction is the concept of hiding complex implementation details and showing only the essential features of an object.

# Implementation:
The Deck class abstracts the details of card creation and shuffling. The user of the Deck class doesn’t need to know how cards are stored or shuffled; they only interact with the shuffle() and dealCard() methods.
The Player and Dealer classes abstract the concept of a Blackjack participant, hiding the details of hand management and value calculation from other parts of the program.

# Inheritance:
 Inheritance allows a class to inherit properties and methods from another class, promoting code reuse and a hierarchical class structure.
# Implementation:
The Dealer class inherits from the Player class. This means that the dealer can use all methods and properties of a player but also includes additional behavior (e.g., shouldHit()).
This approach avoids code duplication since the dealer is just a specialized player with slightly different behavior.

# Polymorphism:
 Polymorphism allows objects of different classes to be treated as objects of a common superclass, typically through method overriding or interfaces.
# Implementation:
Although not heavily emphasized in this basic game, the Player and Dealer classes exhibit polymorphism. A Dealer object can be treated as a Player, allowing shared methods like hit() and getHandValue() to be used polymorphically.

(B) DESIGN CHOICES
# Class Structure:

-Card: Represents an individual playing card. Encapsulates card properties like suit, rank, and value.

-Deck: Manages a collection of Card objects. Handles shuffling and dealing of cards.

-Player: Represents a participant in the game. Manages the player’s hand and calculates the hand's value.

-Dealer: A subclass of Player with additional logic specific to the dealer's behavior (e.g., hitting on a hand value less than 17).

-Game: Orchestrates the flow of the game. Manages interactions between the deck, player, and dealer, including turn-taking and determining the winner.

-Main: The entry point of the program, which initializes the game and starts it.

# Separation of Concerns:
Each class has a single responsibility:
Card handles card details.
Deck manages the card deck.
Player and Dealer manage participants' hands.
Game manages the game flow.

-This separation ensures that changes in one part of the game (e.g., card details) do not affect unrelated components (e.g., game flow).
Game Flow Control:

The Game class handles the entire flow, including dealing cards, managing player and dealer turns, and determining the outcome. This centralized control simplifies debugging and maintenance.
Scalability and Maintainability:

The design allows for easy expansion. For instance, additional game rules or features (like betting) could be added with minimal changes to the existing structure.S
