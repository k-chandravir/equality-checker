package com.m2p;

//import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LengthTest {

    @Test
    void toCheckEqualityWhenOneCentimeterIsComparedToAnotherOneCentimeter(){
        Length oneCentimeter = Length.centimeter(1);

        Length anotherOneCentimeter = Length.centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneMetreIsComparedToHundredCentimeter(){
        Length oneMetre = Length.metre(1);

        Length hundredCentimeter = Length.centimeter(100);

        assertThat(oneMetre, is(equalTo(hundredCentimeter)));
    }

    @Test
    void toCheckEqualityWhenOneHundredCentimeterIsComparedToZeroPointOneKilometer(){
        Length oneKilometer = Length.metre(0.1);

        Length hundredCentimeter = Length.centimeter(100);

        assertThat(oneKilometer, is(not(equalTo(hundredCentimeter))));
    }

}
