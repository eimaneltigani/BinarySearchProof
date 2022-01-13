1. Create a program called Binary Search Proof
2. Have your program pick a random number between 0 and 500
3. Write two methods: randomGuesser and highlowGuesser

Each guessing method should take the range of possibilities as well as the magic number
randomGuesser:
Pick a random number within the given range
Check if that number has already been picked (if so, pick another number)
Check that number against the magic number
if the same, it should return the number of guesses it took to find the magic number
if not the same, it should increment a count of guesses and try again)

highlowGuesser
Pick a random number within the given range
Check to see if that number matches magic number
if its a match, it should return the number of guesses it took to get a match
if its not a match, it should check to see if the guessed number is higher or lower than the magic number, adjust the range accordingly, and pick again
hint: randomGueser and highlowGuesser should use do-while loops

4. Pick a random number and run both randomGuesser and highlowGuesser at least 20 times, find (and output) the average number of tries it takes for each method to reach the outcome. 