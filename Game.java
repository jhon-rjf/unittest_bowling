// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return scoreForFrame(itsCurrentFrame);
    }
//
//    public int getCurrentFrame()
//    {
//        return itsCurrentFrame;
//        // 현재 프레임인 itsCurrentFrame을 반환
//    }

    public void add(int pins)
    {
       itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (lastBallInFrame(pins))
                advanceFrame();
            else
                firstThrowInFrame = false;
        }

    private boolean lastBallInFrame(int pins){
            return strike(pins) || !firstThrowInFrame;
        }

    private  boolean strike(int pins){
            return (firstThrowInFrame && pins ==10);
        }


    private boolean adjustFrameForStrike(int pins) {
        if (pins == 10) {
            advanceFrame();
            return true;
        }
        return false;
    }

    private void advanceFrame() {
        itsCurrentFrame = Math.min(10, itsCurrentFrame + 1);
    }

    public int scoreForFrame(int theFrame)
    {
        return itsScorer.scoreForFrame(theFrame);
    }

//    {
//        ball = 0;
//        int score = 0;
//        for (int currentFrame = 0; currentFrame < theFrame;	currentFrame++) {
//            if (strike()) {
//                score += 10 + nextTwoBallsForStrike();
//                ball++;
//
//            } else if(spare()) {
//            score += 10 + nextBallForSpare();
//            ball += 2;
//            }else {
//                score += twoBallsInFrame();
//                ball += 2;
//            }
//        }
//        return score; // 프레임 점수 반환!
//    }

//    private int nextTwoBallsForStrike(){
//        return itsThrows[ball+1] + itsThrows[ball+2];
//    }
//
//    private int nextBallForSpare(){
//        return itsThrows[ball+2];
//    }
//
//    private boolean strike() {
//        return itsThrows[ball] == 10;
//    }
//    private int nextTwoBalls() {
//        return itsThrows[ball] + itsThrows[ball+1];
//    }
//
//private int handleSecondThrow() {
//        int score = 0;
//    if (spare()) {
//        ball += 2;
//        score += 10 + nextBall();
//    } else {
//        score += twoBallsInFrame();
//        ball += 2;
//    }
//    return score;
//    }
//
//    private int twoBallsInFrame() {
//        return itsThrows[ball] + itsThrows[ball+1];
//    }
//
//    private boolean spare() {
//        return (itsThrows[ball] + itsThrows[ball + 1]) == 10;
//    }
//
//    private int nextBall() {
//        return itsThrows[ball];
//    }
//
//
//
//    private int ball;
//    private int firstThrow;
//    private int secondThrow;
//
//
//    private int itsScore = 0; // 점수 계산
//    private int[] itsThrows = new int[21]; // 프레임
//    private int itsCurrentThrow = 0;// 투구 순번
    private int itsCurrentFrame = 0;; // 현재 프레임 번호
    private boolean firstThrowInFrame = true; // 각 프레임에서 첫번째 투구 여부
    private Scorer itsScorer = new Scorer();
}