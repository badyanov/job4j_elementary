package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        int wordLastIndex = word.length - 1;
        int postLastIndex = post.length - 1;

        for (int i = 0; i < post.length; i++) {
            int wordIndex = wordLastIndex - i;
            int postIndex = postLastIndex - i;

            if (word[wordIndex] != post[postIndex]) {
                result = false;
                break;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}
