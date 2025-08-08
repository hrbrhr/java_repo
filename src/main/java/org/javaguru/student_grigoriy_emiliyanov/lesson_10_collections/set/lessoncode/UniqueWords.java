package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.set.lessoncode;

class UniqueWords {
    static MySetWithList<String> set = new MySetWithList<>();

    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        String text = "this is a sample text it contains several words this text is used for testing the word frequency counter";
        uniqueWords.process(text);
        System.out.println("Number of unique words: " + set.size());
        uniqueWords.print();
    }

    private void process(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            set.add(word);
        }
    }

    private void print() {
        System.out.print("{");
        for (String word : set.getAll()) {
            System.out.print(word);
            System.out.print(", ");
        }
        System.out.print("}");
    }

}
