/*
Допустим у нас в программе Programmer, QA Engineer, BackEnd Programmer,
FrontEnd Programmer
.
Вам необходимо реализовать класс Manger,
который должен содержать информацию о команде, которой управляет Manger).
Т.е. у Manager должен быть список (List) членов команды.

Важное ограничение: создавая менеджера мы определяем “специализацию менеджера”
т.е.командой каких специалистов он может руководить: например,
только специалистами тестирования, или только программистами,
или только фронт-энд программистами.

Реализуйте метод добавления работника в команду. Естественно, в команду
Programmer не должно быть возможным добавить QAEngineer
Класс Manager должен быть generic, и поле List в нем типа T

Можно сделать родительский класс Employee, и  его наследниками Programmer,
QAEngineer. У класса Programmer в свою очередь 2 наследника BackEnd Programmer
и FrontEnd Programmer. Или сделать интерфейс Employee


 */
package app;
//Группа 68m
public class Main {
    public static void main(String[] args) {
        Manager<Programmer> devManager = new Manager<>();
        devManager.addToTeam(new Programmer());
        devManager.addToTeam(new FrontEndProgrammer());
        devManager.addToTeam(new BackEndProgrammer());

        System.out.println("Team of Programmer Manager:");
        devManager.showTeam();

        Manager<QAEngineer> qaManager = new Manager<>();
        qaManager.addToTeam(new QAEngineer());

        System.out.println("\nTeam of QA Manager:");
        qaManager.showTeam();

        // ❌ Ошибка компиляции:
        // devManager.addToTeam(new QAEngineer()); — нельзя добавить QA к программистам!
    }
}
