package com.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 9/12/16.
 */
public class FizzBuzz {
    final String fizz = "fizz";
    final String buzz = "buzz";

    public List<String> seriesOf(int fizz, int buzz, int max) {
        ArrayList<String> series = new ArrayList<String>();
        String element;
        String fizzbuzz;
        int i = 1;

        while (i <= max) {
            fizzbuzz = "";

            if (i % fizz == 0) {
                fizzbuzz += this.fizz;
            }

            if (i % buzz == 0) {
                fizzbuzz += this.buzz;
            }

            if (fizzbuzz.equals("")) {
                element = Integer.toString(i);
            } else {
                element = fizzbuzz;
            }

            series.add(element);

            i++;
        }

        return series;
    }
}
