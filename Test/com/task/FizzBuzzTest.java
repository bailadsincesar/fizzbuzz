package com.task;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cesar on 9/12/16.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void resultLengthShouldBeEqualsThanMax() throws Exception {
        //arrange
        int fizz = 3;
        int buzz = 5;
        int max = 21;

        //act
        List<String> result = this.fizzBuzz.seriesOf(fizz, buzz, max);

        //assert
        assertEquals(max, result.size());
    }

    @Test
    public void fiveteenthElementShouldBeFizzBuzz() throws Exception {
        //arrange
        int fizz = 3;
        int buzz = 5;
        int max = 21;
        int index = 14;
        String expectedString = "fizzbuzz";

        //act
        List<String> result = this.fizzBuzz.seriesOf(fizz, buzz, max);

        //assert
        assertEquals(expectedString, result.get(index));
    }

    @Test
    public void shouldShowFizzBuzzOnlyWhenBothNumbersAreTheSame() throws Exception {
        //arrange
        int fizz = 3;
        int buzz = 3;
        int max = 7;
        int requiredOccurences = 2;
        String expectedString = "fizzbuzz";

        //act
        List<String> result = this.fizzBuzz.seriesOf(fizz, buzz, max);
        int fizzbuzzOccurences = 0;
        String currentElement;
        for (int i = 0; i < result.size(); i++) {
            currentElement = result.get(i);
            if (currentElement.equals(expectedString)) {
                fizzbuzzOccurences++;
            }
        }

        assertEquals(requiredOccurences, fizzbuzzOccurences);

    }

    @Test
    public void shouldReturnFizzOnly() throws Exception {
        //arrange
        int fizz = 10;
        int buzz = 15;
        int max = 19;
        int requiredOccurences = 1;
        String fizzString = "fizz";

        //act
        List<String> result = this.fizzBuzz.seriesOf(fizz, buzz, max);
        int fizzOccurences = 0;
        String currentElement;
        for (int i = 0; i < result.size(); i++) {
            currentElement = result.get(i);
            if (currentElement.equals(fizzString)) {
                fizzOccurences++;
            }
        }

        assertEquals(requiredOccurences, fizzOccurences);
    }
}