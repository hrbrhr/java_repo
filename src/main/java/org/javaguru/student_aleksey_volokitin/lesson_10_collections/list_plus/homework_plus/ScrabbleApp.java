package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list_plus.homework_plus;

class ScrabbleApp {
    public static void main(String[] args) {
        long startTimeOfRunning = System.nanoTime();

        int firstCountOfWords = 300;
        int secondCountOfWords = 3000;
        int thirdCountOfWords = 30000;

        String timeOfFillingWordsArray =
                formattedTime(benchmarkFillingWords("ArrayList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkFillingWords("ArrayList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkFillingWords("ArrayList", thirdCountOfWords));
        String timeOfFillingWordsLinked =
                formattedTime(benchmarkFillingWords("LinkedList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkFillingWords("LinkedList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkFillingWords("LinkedList", thirdCountOfWords));

        String timeOfRemoveAllWordsArray =
                formattedTime(benchmarkRemoveAllWords("ArrayList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkRemoveAllWords("ArrayList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkRemoveAllWords("ArrayList", thirdCountOfWords));
        String timeOfRemoveAllWordsLinked =
                formattedTime(benchmarkRemoveAllWords("LinkedList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkRemoveAllWords("LinkedList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkRemoveAllWords("LinkedList", thirdCountOfWords));

        String timeOfGetAllWordsArray =
                formattedTime(benchmarkGetAllWords("ArrayList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkGetAllWords("ArrayList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkGetAllWords("ArrayList", thirdCountOfWords));
        String timeOfGetAllWordsLinked =
                formattedTime(benchmarkGetAllWords("LinkedList", firstCountOfWords)) + "\t" +
                formattedTime(benchmarkGetAllWords("LinkedList", secondCountOfWords)) + "\t" +
                formattedTime(benchmarkGetAllWords("LinkedList", thirdCountOfWords));

        String timeOfAddWordToStartArray =
                formattedTime(benchmarkAddWord("ArrayList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", thirdCountOfWords, 0));
        String timeOfAddWordToStartLinked =
                formattedTime(benchmarkAddWord("LinkedList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", thirdCountOfWords, 0));

        String timeOfAddWordToMiddleArray =
                formattedTime(benchmarkAddWord("ArrayList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", thirdCountOfWords, thirdCountOfWords / 2));
        String timeOfAddWordToMiddleLinked =
                formattedTime(benchmarkAddWord("LinkedList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", thirdCountOfWords, thirdCountOfWords / 2));

        String timeOfAddWordToEndMinusTwoArray =
                formattedTime(benchmarkAddWord("ArrayList", firstCountOfWords, firstCountOfWords - 2)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", secondCountOfWords, secondCountOfWords - 2)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", thirdCountOfWords, thirdCountOfWords - 2));
        String timeOfAddWordToEndMinusTwoLinked =
                formattedTime(benchmarkAddWord("LinkedList", firstCountOfWords, firstCountOfWords - 2)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", secondCountOfWords, secondCountOfWords - 2)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", thirdCountOfWords, thirdCountOfWords - 2 ));

        String timeOfAddWordToEndArray =
                formattedTime(benchmarkAddWord("ArrayList", firstCountOfWords, firstCountOfWords)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", secondCountOfWords, secondCountOfWords)) + "\t" +
                formattedTime(benchmarkAddWord("ArrayList", thirdCountOfWords, thirdCountOfWords));
        String timeOfAddWordToEndLinked =
                formattedTime(benchmarkAddWord("LinkedList", firstCountOfWords, firstCountOfWords)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", secondCountOfWords, secondCountOfWords)) + "\t" +
                formattedTime(benchmarkAddWord("LinkedList", thirdCountOfWords, thirdCountOfWords));

        String timeOfRemoveWordToStartArray =
                formattedTime(benchmarkRemoveWord("ArrayList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", thirdCountOfWords, 0));
        String timeOfRemoveWordToStartLinked =
                formattedTime(benchmarkRemoveWord("LinkedList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", thirdCountOfWords, 0));

        String timeOfRemoveWordToMiddleArray =
                formattedTime(benchmarkRemoveWord("ArrayList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", thirdCountOfWords, thirdCountOfWords / 2));
        String timeOfRemoveWordToMiddleLinked =
                formattedTime(benchmarkRemoveWord("LinkedList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", thirdCountOfWords, thirdCountOfWords / 2));

        String timeOfRemoveWordToEndMinusTwoArray =
                formattedTime(benchmarkRemoveWord("ArrayList", firstCountOfWords, firstCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", secondCountOfWords, secondCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", thirdCountOfWords, thirdCountOfWords - 3));
        String timeOfRemoveWordToEndMinusTwoLinked =
                formattedTime(benchmarkRemoveWord("LinkedList", firstCountOfWords, firstCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", secondCountOfWords, secondCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", thirdCountOfWords, thirdCountOfWords - 3));

        String timeOfRemoveWordToEndArray =
                formattedTime(benchmarkRemoveWord("ArrayList", firstCountOfWords, firstCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", secondCountOfWords, secondCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkRemoveWord("ArrayList", thirdCountOfWords, thirdCountOfWords - 1));
        String timeOfRemoveWordToEndLinked =
                formattedTime(benchmarkRemoveWord("LinkedList", firstCountOfWords, firstCountOfWords -1)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", secondCountOfWords, secondCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkRemoveWord("LinkedList", thirdCountOfWords, thirdCountOfWords - 1));

        String timeOfGetWordToStartArray =
                formattedTime(benchmarkGetWord("ArrayList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", thirdCountOfWords, 0));
        String timeOfGetWordToStartLinked =
                formattedTime(benchmarkGetWord("LinkedList", firstCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", secondCountOfWords, 0)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", thirdCountOfWords, 0));

        String timeOfGetWordToMiddleArray =
                formattedTime(benchmarkGetWord("ArrayList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", thirdCountOfWords, thirdCountOfWords / 2));
        String timeOfGetWordToMiddleLinked =
                formattedTime(benchmarkGetWord("LinkedList", firstCountOfWords, firstCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", secondCountOfWords, secondCountOfWords / 2)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", thirdCountOfWords, thirdCountOfWords / 2));

        String timeOfGetWordToEndMinusTwoArray =
                formattedTime(benchmarkGetWord("ArrayList", firstCountOfWords, firstCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", secondCountOfWords, secondCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", thirdCountOfWords, thirdCountOfWords - 3));
        String timeOfGetWordToEndMinusTwoLinked =
                formattedTime(benchmarkGetWord("LinkedList", firstCountOfWords, firstCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", secondCountOfWords, secondCountOfWords - 3)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", thirdCountOfWords, thirdCountOfWords - 3));

        String timeOfGetWordToEndArray =
                formattedTime(benchmarkGetWord("ArrayList", firstCountOfWords, firstCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", secondCountOfWords, secondCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkGetWord("ArrayList", thirdCountOfWords, thirdCountOfWords - 1));
        String timeOfGetWordToEndLinked =
                formattedTime(benchmarkGetWord("LinkedList", firstCountOfWords, firstCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", secondCountOfWords, secondCountOfWords - 1)) + "\t" +
                formattedTime(benchmarkGetWord("LinkedList", thirdCountOfWords, thirdCountOfWords - 1));

        System.out.println("Среднее время выполнения методов при использовании ArrayList (верхняя строка) и LinkedList (нижняя строка).\n\n" +
                           "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   количество слов:\n"  +
                           "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + firstCountOfWords +
                           "\t\t\t" + secondCountOfWords +
                           "\t\t\t" + thirdCountOfWords +
                           "\n" +
                           "заполнение слов:                         (ArrayList)\t" + timeOfFillingWordsArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfFillingWordsLinked + "\n" +
                           "\n" +
                           "удаление всех слов по одному:            (ArrayList)\t" + timeOfRemoveAllWordsArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfRemoveAllWordsLinked + "\n" +
                           "\n" +
                           "получение всех слов по одному:           (ArrayList)\t" + timeOfGetAllWordsArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfGetAllWordsLinked + "\n" +
                           "\n" +
                           "добавление элемента в начало списка:     (ArrayList)\t" + timeOfAddWordToStartArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfAddWordToStartLinked + "\n" +
                           "\n" +
                           "добавление элемента в середину списка:   (ArrayList)\t" + timeOfAddWordToMiddleArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfAddWordToMiddleLinked + "\n" +
                           "\n" +
                           "добавление предпоследнего элемента:      (ArrayList)\t" + timeOfAddWordToEndMinusTwoArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfAddWordToEndMinusTwoLinked + "\n" +
                           "\n" +
                           "добавление элемента в конец списка:      (ArrayList)\t" + timeOfAddWordToEndArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfAddWordToEndLinked + "\n" +
                           "\n" +
                           "удаление элемента из начала списка:      (ArrayList)\t" + timeOfRemoveWordToStartArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfRemoveWordToStartLinked + "\n" +
                           "\n" +
                           "удаление элемента из середины списка:    (ArrayList)\t" + timeOfRemoveWordToMiddleArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfRemoveWordToMiddleLinked + "\n" +
                           "\n" +
                           "удаление предпоследнего элемента:        (ArrayList)\t" + timeOfRemoveWordToEndMinusTwoArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfRemoveWordToEndMinusTwoLinked + "\n" +
                           "\n" +
                           "удаление элемента из конца списка:       (ArrayList)\t" + timeOfRemoveWordToEndArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfRemoveWordToEndLinked + "\n" +
                           "\n" +
                           "получение элемента из начала списка:     (ArrayList)\t" + timeOfGetWordToStartArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfGetWordToStartLinked + "\n" +
                           "\n" +
                           "получение элемента из середины списка:   (ArrayList)\t" + timeOfGetWordToMiddleArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfGetWordToMiddleLinked + "\n" +
                           "\n" +
                           "получение предпоследнего элемента:       (ArrayList)\t" + timeOfGetWordToEndMinusTwoArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfGetWordToEndMinusTwoLinked + "\n" +
                           "\n" +
                           "получение элемента из конца списка:      (ArrayList)\t" + timeOfGetWordToEndArray + "\n" +
                           "\t\t\t\t\t\t\t\t\t    (LinkedList)\t" + timeOfGetWordToEndLinked +
                           "\n");

        long endTimeOfRunning = System.nanoTime();
        long durationTimeOfRunning = (endTimeOfRunning - startTimeOfRunning) / 1_000_000_000;
        System.out.println("Общее время работы программы: " + durationTimeOfRunning + " сек.");

    }

    private static String formattedTime(long time) {
        String result = "";
        if(time > 10_000_000) {
            int timeToMs = (int) time / 1_000_000;
            int countOfDigits = Integer.toString(timeToMs).length();
            for (int i = 0; i < 7 - countOfDigits; i++) {
                result += " ";
            }
            result = result + timeToMs + " Милли";
        }
        else {
            int countOfDigits = Long.toString(time).length();
            for (int i = 0; i < 7 - countOfDigits; i++) {
                result += " ";
            }
            result = result + time + "  Нано";
        }
        return result;
    }

    private static long benchmarkFillingWords(String typeOfList, int countOfWords) {
        long fillingWordsDuration= 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);

            long startTime = System.nanoTime();
            scrabble.fillingWords(countOfWords);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            fillingWordsDuration += duration;
        }
        return fillingWordsDuration / 30;
    }

    private static long benchmarkRemoveAllWords(String typeOfList, int countOfWords) {
        long removeAllWordsDuration = 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);
            scrabble.fillingWords(countOfWords);

            long startTime = System.nanoTime();
            scrabble.removeAllWords();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            removeAllWordsDuration += duration;
        }
        return removeAllWordsDuration / 30;
    }

    private static long benchmarkGetAllWords(String typeOfList, int countOfWords) {
        long getAllWordsDuration = 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);
            scrabble.fillingWords(countOfWords);

            long startTime = System.nanoTime();
            scrabble.getAllWords();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            getAllWordsDuration += duration;
        }
        return getAllWordsDuration / 30;
    }

    private static long benchmarkAddWord(String typeOfList, int countOfWords, int index) {
        long addWordDuration= 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);
            scrabble.fillingWords(countOfWords);

            long startTime = System.nanoTime();
            scrabble.addWord(index);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            addWordDuration += duration;
        }
        return addWordDuration / 30;
    }

    private static long benchmarkRemoveWord(String typeOfList, int countOfWords, int index) {
        long removeWordDuration= 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);
            scrabble.fillingWords(countOfWords);

            long startTime = System.nanoTime();
            scrabble.removeWord(index);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            removeWordDuration += duration;
        }
        return removeWordDuration / 30;
    }

    private static long benchmarkGetWord(String typeOfList, int countOfWords, int index) {
        long getWordDuration= 0;

        for (int i = 0; i < 30; i++) {
            Scrabble scrabble = new Scrabble(typeOfList);
            scrabble.fillingWords(countOfWords);

            long startTime = System.nanoTime();
            scrabble.getWord(index);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            getWordDuration += duration;
        }
        return getWordDuration / 30;
    }
}
