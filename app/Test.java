public class Test {
  public static void main(String[] args) {
    Test2 person1 = new Test2("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    Test2 person2 = new Test2("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    Test2.printCount();
  }
}