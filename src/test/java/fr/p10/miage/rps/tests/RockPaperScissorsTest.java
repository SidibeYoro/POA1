package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class RockPaperScissorsTest {
    private RockPaperScissors rps;
    @BeforeClass
    public void setUp()
    {
          rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown()
    {
       rps = null;
    }

    @DataProvider(name = "testwin")
    public static Object[][] testwin() {
        return new Object[][]{{String.valueOf(RPSEnum.ROCK), String.valueOf(RPSEnum.SCISSORS)},{String.valueOf(RPSEnum.SCISSORS), String.valueOf(RPSEnum.PAPER)},{String.valueOf(RPSEnum.PAPER), String.valueOf(RPSEnum.ROCK)}};
    }

    @DataProvider(name = "testlost")
    public static Object[][] testlost() {
        return new Object[][]{{String.valueOf(RPSEnum.SCISSORS), String.valueOf(RPSEnum.ROCK)},{String.valueOf(RPSEnum.PAPER), String.valueOf(RPSEnum.SCISSORS)},{String.valueOf(RPSEnum.ROCK), String.valueOf(RPSEnum.PAPER)}};
    }

    @DataProvider(name = "testtie")
    public static Object[][] testie() {
        return new Object[][]{{String.valueOf(RPSEnum.ROCK), String.valueOf(RPSEnum.ROCK)},{String.valueOf(RPSEnum.SCISSORS), String.valueOf(RPSEnum.SCISSORS)},{String.valueOf(RPSEnum.PAPER), String.valueOf(RPSEnum.PAPER)}};
    }



    @Test(dataProvider ="testwin" )
    public void testWinPlay(String p1, String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }
    @Test(dataProvider ="testlost" )
    public void testLostPlay(String p1, String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }


    @Test(dataProvider ="testtie" )
    public void testTiePlay(String p1, String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

}

