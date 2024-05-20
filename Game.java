// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return scoreForFrame(getCurrentFrame() -1);
    }

    public void add(int pins)
    {
        itsThrows[itsCurrentThrow++]=pins;
        itsScore += pins;
        adjustCurrentFrame(pins);
    }

    void adjustCurrentFrame(int pins) {
        if (firstThrowInFrame == true) {
            if(pins==10)//스트라이크
                itsCurrentFrame++;
            else
                firstThrowInFrame = false;
        } else {
            firstThrowInFrame=true;
            itsCurrentFrame++;
            // 내가 던지고 있는 프레임 번호를 지정하기 위해 각 프레임의 마지막 투구 직후에 증가
            // 다음에 투구할 프레임을 가르키게 됨
        }
        itsCurrentFrame = Math.min(11, itsCurrentFrame);
    }

    public int scoreForFrame(int theFrame)
    {
        ball = 0;
        int score = 0;

        for (int currentFrame = 0; currentFrame < theFrame;	currentFrame++) {
            firstThrow = itsThrows[ball++]; // 첫 번째 투구 계산
            if (firstThrow == 10) {
                score += 10 + itsThrows[ball] + itsThrows[ball + 1];
            } else {
                 secondThrow = itsThrows[ball++];

                int frameScore = firstThrow + secondThrow;
                if (frameScore == 10)
                    score += frameScore + itsThrows[ball];
                else
                    score += frameScore;
            }
        }// end for-loop

        return score; // 프레임 점수 반환!
    }






    public int getCurrentFrame()
    {
        return itsCurrentFrame;
        // 현재 프레임인 itsCurrentFrame을 반환
    }

    private int ball;
    private int firstThrow;
    private int secondThrow;



    private int itsScore = 0; // 점수 계산
    private int[] itsThrows = new int[21]; // 프레임
    private int itsCurrentThrow = 0;// 투구 순번
    private int itsCurrentFrame = 1;; // 현재 프레임 번호
    private boolean firstThrowInFrame = true; // 각 프레임에서 첫번째 투구 여부

}