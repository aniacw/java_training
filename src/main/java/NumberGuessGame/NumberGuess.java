package NumberGuessGame;

public class NumberGuess {
    private int randomNumber;
    private boolean hasWon;//?????

    public NumberGuess() {
        this.randomNumber = randomNumber;
    }

    public int createRandomNumber() {
        randomNumber = (int) (Math.random()*100) +1;
        return randomNumber;
    }
}
