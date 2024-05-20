// Game.java --------------------------------------------
public class Game {

    public int score()
    {
        return scoreForFrame(getCurrentFrame() -1);
    }

    public int getCurrentFrame()
    {
        return itsCurrentFrame;
        // 현재 프레임인 itsCurrentFrame을 반환
    }

    public void add(int pins)
    {
       itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (firstThrowInFrame == true) {
            if(adjustFrameForStrike(pins) == false)//스트라이크
                advanceFrame();
            else
                firstThrowInFrame = false;
        } else {
            firstThrowInFrame=true;
            advanceFrame();
            // 내가 던지고 있는 프레임 번호를 지정하기 위해 각 프레임의 마지막 투구 직후에 증가
            // 다음에 투구할 프레임을 가르키게 됨
        }
    }

    private boolean adjustFrameForStrike(int pins) {
        if (pins == 10) {
            advanceFrame();
            return true;
        }
        return false;
    }

    private void advanceFrame() {
        itsCurrentFrame = Math.min(11, itsCurrentFrame + 1);
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

    private int itsScore = 0; // 점수 계산
//    private int[] itsThrows = new int[21]; // 프레임
//    private int itsCurrentThrow = 0;// 투구 순번
    private int itsCurrentFrame = 1;; // 현재 프레임 번호
    private boolean firstThrowInFrame = true; // 각 프레임에서 첫번째 투구 여부
    private Scorer itsScorer = new Scorer();
}