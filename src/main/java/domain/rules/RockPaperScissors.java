package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {

        if (mine == theirs) {
            return Result.DRAW;
        }

        switch (mine) {
            case ROCK:
                if (theirs.equals(Move.SCISSORS)) return Result.WIN;
                break;

            case PAPER:
                if (theirs.equals(Move.ROCK)) return Result.WIN;
                break;

            case SCISSORS:
                if (theirs.equals(Move.PAPER)) return Result.WIN;
                break;
        }

        return Result.LOSE;
    }
}
