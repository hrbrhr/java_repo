Уберите из класса GradeCalculatorApplication main()
Scanner и все что с ним связано.

Для задания в программе оценок просто создайте несколько переменных:

int mark1 = 34;
int mark2 = 45;
и так далее (значение оценок задайте какие хотите).

Далее вызовите метод calculateGrade() и подайте ему 
как параметр эти оценки:

String grade1 = calculator.calculateGrade(mark1);
String grade2 = calculator.calculateGrade(mark2);
и так далее.

Запустите программу. Вот так просто можно вызывать
(использовать) наш алгоритм многократно!

PS: решение ментора этой задачи вы найдете в папке code 
этого урока. Прежде чем заглядывать туда попробуйте 
решить поставленную задачу самостоятельно.