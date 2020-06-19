package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            rsl = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void printAnswer(String question) {
        System.out.println(answer(question));
    }

    public static void main(String[] args) {
        printAnswer("Привет, Бот.");
        printAnswer("Пока.");
        printAnswer("Как тебя зовут?");
    }
}
