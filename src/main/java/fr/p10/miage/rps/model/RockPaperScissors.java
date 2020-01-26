package fr.p10.miage.rps.model;

public class RockPaperScissors {
    public RockPaperScissors()
    {

    }
    public Result play(RPSEnum p1, RPSEnum p2) {
        if (p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK)
            return Result.WIN;
        else if (p1 == RPSEnum.PAPER && p2 == RPSEnum.SCISSORS)
            return Result.LOST;
        else if (p1 == RPSEnum.ROCK && p2 == RPSEnum.PAPER)
            return Result.LOST;
        else if (p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS)
            return Result.WIN;
        else if (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER)
            return Result.WIN;
        else if (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.ROCK)
            return Result.LOST;

        else
            return Result.TIE;
    }
}
