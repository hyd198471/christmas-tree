package com.booxware.test;

import org.junit.Assert;
import org.junit.Test;

public class ChristmasTreeCreatorTest {

    private ChristmasTreeCreator creator = new ChristmasTreeCreator();

    @Test
    public void testDrawChristmasTreeWithTopStar() throws Exception {
        //given


        //when
        String christmasTree = creator.drawChristmasTree(5, true);

        //then
        Assert.assertEquals("    *\n" +
                "    X\n" +
                "   XXX\n" +
                "  XXXXX\n" +
                " XXXXXXX\n" +
                "XXXXXXXXX\n" +
                "    X",christmasTree);


    }


    @Test
    public void testDrawChristmasTreeWithoutTopStar() throws Exception {
        //given


        //when
        String christmasTree = creator.drawChristmasTree(4, false);

        //then
        Assert.assertEquals("    X\n" +
                "   XXX\n" +
                "  XXXXX\n" +
                " XXXXXXX\n" +
                "XXXXXXXXX\n" +
                "    X", christmasTree);


    }


}