package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.adapter.FigureJaneAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Plotter test.
 *
 * @author Dominik
 */
public class Job2dDriverTest {

    private static Job2dDriver driver = new StubDriver();
    private static AbstractDriver figureJaneDriver = new FigureJaneAdapter();

    /**
     * Driver test.
     */
    public static void main(String[] args) {
        FiguresJoe.figureScript1(driver);
        FiguresJane.figureScript(figureJaneDriver);
    }

    private static class StubDriver implements Job2dDriver {

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Driver operateTo action...");
        }

        @Override
        public void setPosition(int x, int y) {
            System.out.println("Driver setPosition action...");
        }
    }
}
