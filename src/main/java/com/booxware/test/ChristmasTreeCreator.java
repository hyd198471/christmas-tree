package com.booxware.test;

public class ChristmasTreeCreator {

    private static final String X = "X";
    private static final String WHITESPACE = " ";

    public String drawChristmasTree(int numberOfRows, boolean withRoof) {
        StringBuilder sb = new StringBuilder();
        if (withRoof) {
            sb.append(getNumberOfWhitespace(numberOfRows)).append("*").append(System.lineSeparator());
        }
        sb.append(createBaseTree(numberOfRows));
        return sb.toString();
    }

    private String createBaseTree(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRows; i++) {
            sb.append(getNumberOfWhitespace(numberOfRows - i));
            for (int j = 0; j < 2 * i + 1; j++) {
                sb.append(X);
            }
            sb.append(System.lineSeparator());
        }
        sb.append(getNumberOfWhitespace(numberOfRows)).append(X);
        return sb.toString();
    }

    private String getNumberOfWhitespace(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfRows - 1; i++) {
            sb.append(WHITESPACE);
        }
        return sb.toString();
    }

}
