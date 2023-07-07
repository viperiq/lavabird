# lavabird
The Bird class represents the player's bird character. It handles the bird's position, physics, rendering, and resetting. The bird is displayed using an image, and it can jump when the player presses the spacebar.

The FlappyBird class serves as the main entry point of the game. It sets up the game window, initializes the bird, manages the game loop using a timer, handles user input, and keeps track of the player's score. It also creates and manages a list of rectangular pipes that the bird must navigate through.

The GamePanel class extends JPanel and is responsible for rendering the game components. It draws the bird, the pipes, and the player's score on the game panel. It also handles the rendering of the background and provides a paused state display when the game is paused.
