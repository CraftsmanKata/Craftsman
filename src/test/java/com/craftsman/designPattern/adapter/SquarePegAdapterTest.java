package com.craftsman.designPattern.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquarePegAdapterTest {


    @Test
    void TestAdapterSmallRoundPegToRoundHole(){
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        assertEquals(hole.fits(rpeg),true);
    }

    @Test
    void TestAdapterLargeRoundPegToRoundHole(){
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(8);

        assertEquals(hole.fits(rpeg),false);
    }

    @Test
    void TestAdapterSmallSqPegToRoundHole(){
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        SquarePeg smallSqPeg = new SquarePeg(2);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);

        assertEquals(hole.fits(smallSqPegAdapter),true);
    }

    @Test
    void TestAdapterLargeSqPegToRoundHole(){
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        assertEquals(hole.fits(largeSqPegAdapter),false);
    }
}