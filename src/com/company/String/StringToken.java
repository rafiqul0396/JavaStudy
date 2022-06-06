package com.company.String;

import java.util.Formatter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToken {
    public static void main(String[] args) {
        String str = "the lazy fox jumped over the brown fence";
        StringTokenizer tokenizer = new StringTokenizer(str);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        StringJoiner sj = new StringJoiner(", ", "[", "]");
        // The last two arguments are optional,
        // they define prefix and suffix for the result string
        sj.add("foo");
        sj.add("bar");
        sj.add("foobar");
        System.out.println(sj); // Prints "[foo, bar, foobar]"


       /* String[] elements = { "foo", "bar", "foobar" };
        String singleString = String.join(" + ", elements);
        System.out.println(singleString); // Prints "foo + bar + foobar"

        Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
        String joined = stringStream.collect(Collectors.joining(", "));
        System.out.println(joined); // Prints "foo, bar, foobar"


        Stream<String> stringStream1 = Stream.of("foo", "bar", "foobar");
        String joined1 = stringStream.collect(Collectors.joining(", ", "{", "}"));
        System.out.println(joined1); // Prints "{foo, bar, foobar}"

        */

        String str1 = "study";
        str1.concat("tonight");
        System.out.println(str1); // Output: study
        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");
        System.out.println(strB); // Output: studytonight

        int one = 1;
        String color = "red";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("One=").append(one).append(", Color=").append(color).append('\n');
        System.out.print(sb1);
// Prints "One=1, Colour=red" followed by an ASCII newline.


        int one1 = 1;
        String color1 = "red";
        Formatter f = new Formatter();
        System.out.print(f.format("One=%d, colour=%s%n", one, color));
// Prints "One=1, Colour=red" followed by the platform's line separator
// The same thing using the `String.format` convenience method
        System.out.print(String.format("One=%d, color=%s%n", one, color));

        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
        for (String s : new String[]{"A", "B", "C"}) {
            sj1.add(s);
        }
        System.out.println(sj1);
// Prints "[A, B, C]"



    }
}
