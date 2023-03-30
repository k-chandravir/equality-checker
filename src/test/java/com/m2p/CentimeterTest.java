package com.m2p;

//import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest {

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedToAnotherOneCentimeter(){
        Centimeter oneCentimeter = new Centimeter(1);

        Centimeter anotherOneCentimeter = new Centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneMetreIsComparedToHundredCentimeter(){
        Centimeter oneMetre = Centimeter.getCentimeterFromMetre(1);

        Centimeter hundredCentimeter = new Centimeter(100);

        assertThat(oneMetre, is(equalTo(hundredCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneHundredCentimeterIsComparedToZeroPointOneKilometer(){
        Centimeter oneMetre = Centimeter.getCentimeterFromKilometer(0.1);

        Centimeter hundredCentimeter = new Centimeter(100);

        assertThat(oneMetre, is(not(equalTo(hundredCentimeter))));
    }

}
