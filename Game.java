// Game.java --------------------------------------------
public class Game {
    public int score() {
        return itsScore;
    }
    public void add(int pins) {
        itsScore += pins;
    }
    private int itsScore = 0;

    public int scoreForFrame(int frame)
    {
        return 0;
    }
}
