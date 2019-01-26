# Advent of Code 2018

My solutions to the 2018 Advent of Code puzzles, implemented in Java. `main` is called from
`AdventLauncher`, which creates a `PuzzleManager` manager that creates an instance of a class 
(ex. `Day`_n_) for each day. `PuzzleManager` stores each day's solutions (part 1 and 2) as strings
in a HashMap. After all days have had their solutions run and stored, `main` calls 
`printSolutions()`  which prints solutions to the terminal window.

## TODO
