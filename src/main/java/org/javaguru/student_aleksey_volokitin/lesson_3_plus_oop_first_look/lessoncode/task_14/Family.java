package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_14;

class Family {
    private Human mother;
    private Human father;
    private Human child;

    Family(Human mother, Human father, Human child) {
        this.mother = mother;
        this.father = father;
        this.child = child;
    }

    Human getMother() { return mother; }
    Human getFather() { return father; }
    Human getChild()  { return child; }

    void setMother(Human newMother) { this.mother = newMother; }
    void setFather(Human newFather) { this.father = newFather; }
    void setChild(Human child)      { this.child = child; }

    void printFamily() {
        String resultString = "Family: \n" +
                              "Mother: " + this.mother.getFirstName() +
                              " " + this.mother.getLastName() +
                              ", " + this.mother.getAge() +
                              " years \n" +
                              "Father: " + this.father.getFirstName() +
                              " " + this.father.getLastName() +
                              ", " + this.father.getAge() +
                              " years \n" +
                              "Child:  " + this.child.getFirstName() +
                              " " + this.child.getLastName() +
                              ", " + this.child.getAge() +
                              " years \n";
        System.out.println(resultString);
    }
}
