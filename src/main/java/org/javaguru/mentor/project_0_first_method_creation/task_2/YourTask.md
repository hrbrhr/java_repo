Давайте начнем с постановки бизнес задачи.
Она нам нужна для того, чтобы у наших примеров 
появился реальный контекст. 

Вот такую задачу нас попросил решить бизнес:

   Напишите программу, которая принимает оценку студента
   в сто бальной системе (от 0 до 100) и выводит соответствующую 
   категорию (в виде буквы) "A" для 90-100, "B" для 80-89, 
   "C" для 70-79, "D" для 60-69 и "F" для 0-59.

Попробуйте решить эту задачу в лоб. 

Создайте класс GradeCalculatorApplication:

class GradeCalculatorApplication {

   public static void main(String[] args) {
      // запросите оценку с консоли
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter mark (0 - 100):");
      int mark = scanner.nextInt();

      // решите задачу тут
   }

}

PS: решение ментора этой задачи вы найдете в папке code 
этого урока. Прежде чем заглядывать туда попробуйте 
решить поставленную задачу самостоятельно.