package com.codecool.zsana.hackerrank;

// Medium 30 points
class Encryption {

    String url = "https://www.hackerrank.com/challenges/encryption/problem";

    static String encryption(String s) {
        String withoutSpace = s.replaceAll(" ","");
        if (withoutSpace.length() <= 1) {
            return withoutSpace;
        }
        int columns = (int)Math.ceil(Math.sqrt(withoutSpace.length()));
        StringBuilder outBuilder = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            StringBuilder builder = new StringBuilder();
            for (int y = 0; y < withoutSpace.length()-i; y += columns) {
                builder.append(withoutSpace.charAt(i+y));
            }
            outBuilder.append(builder);
            outBuilder.append(" ");
        }
        return outBuilder.toString().trim();
    }
}
