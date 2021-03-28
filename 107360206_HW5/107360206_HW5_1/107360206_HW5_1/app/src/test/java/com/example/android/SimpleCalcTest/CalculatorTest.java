/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalcTest;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic.
 * These are local unit tests; no device needed.
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Sets up the environment for testing.
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Tests for simple addition.
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }
    /**
     * Tests for addition with a negative operand.
     */
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    /**
     * Tests for addition where the result is negative.
     */
    @Test
    public void addTwoNumbersWorksWithNegativeResult() {
        double resultAdd = mCalculator.add(-1d, -17d);
        assertThat(resultAdd, is(equalTo(-18d)));
    }
    /**
     * Tests for floating-point addition.
     */
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111d, 1.111d);
        assertThat(resultAdd, is(equalTo(2.222)));
    }

    /**
     * Tests for especially large numbers.
     */
    @Test
    public void addTwoNumbersBignums() {
        double resultAdd = mCalculator.add(123456781d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567892d)));
    }
    /**
     * Tests for simple subtraction.
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    /**
     * Tests for simple subtraction with a negative result.
     */
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    /**
     * Tests for simple division.
     */
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    /**
     * Tests for divide by zero; must throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void divByZeroThrows() {
        mCalculator.div(32d,0d);
    }

    /**
     * Tests for divide by zero; always fails, so removed.
     */
    /*@Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }*/


    /**
     * Tests for simple multiplication.
     */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

    /*
    1 : A test with positive integer operands.
    2 : A test with a negative integer as the first operand.
    3 : A test with a negative integer as the second operand.
    4 : A test with 0 as the first operand and a positive integer as the second operand.
    5 : A test with 0 as the second operand.
    6 : A test with 0 as the first operand and -1 as the second operand. (Hint: consult the documentation for Double.POSITIVE_INFINITY.)
    7 : A test with -0 as the first operand and any negative number as the second operand.
     */
    @Test(expected = IllegalArgumentException.class)
    public void powTwoNumbers() {

        double resultMul1 = mCalculator.pow(2d, 3d);
        Assert.assertEquals(8d, resultMul1);

        double resultMul2 = mCalculator.pow(-2d, 3d);
        Assert.assertEquals(-8d, resultMul2);

        double resultMul3 = mCalculator.pow(2d, -3d);
        Assert.assertEquals(0.125d, resultMul3);

        double resultMul4 = mCalculator.pow(0d, 3d);
        Assert.assertEquals(0d, resultMul4);

        double resultMul5 = mCalculator.pow(2d, 0d);
        Assert.assertEquals(1d, resultMul5);

        mCalculator.pow(0d, -1d);

        mCalculator.pow(-0d, -3d);

    }

}