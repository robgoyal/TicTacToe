## Tic Tac Toe


### About

A simple Tic Tac Toe game using Java's Swing GUI. 

### Procedure

The application currently only supports 2 players. I could've created a bot with the minimax algorithm and included one player support but there was enough challenges with creating the two player version. Some of the challenges with designing this app was grasping how objects communicate with each other, developing a GUI, and trying to reset the board once a win situation occurred. 

XOButton is a separate class to behave as a button and include the action listener for buttons. The action listener also confirms if a button is clicked and calls to check for a win situation.

The playGame class performs the checks to see if a win occurs, displays the winner and resets the board. The check to see if a winner occurs could be vastly improved with an algorithm that scans the board instead of check all 8 conditions. 

