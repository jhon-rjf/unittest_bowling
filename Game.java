// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return itsScore;
    }

    public void add(int pins)
    {
        itsThrows[itsCurrentThrow++]=pins;
        //현재 투구에 pins 값 저장, 다음 투구로 ++해준다
        itsScore += pins;
    }

    public int scoreForFrame(int theFrame) // 배열 돌면서 계산
    {
        int ball = 0;
        int score = 0;
        for (int currentFrame = 0; currentFrame < theFrame; currentFrame++)
        {
            score += itsThrows[ball++] + itsThrows[ball++];
        }
        return score;
    }

    private int itsScore = 0; // 점수 계산
    private int[] itsThrows = new int[21]; // 프레임
    private int itsCurrentThrow = 0;// 투구 순번
}