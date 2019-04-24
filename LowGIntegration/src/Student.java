
/**
 * Object class to describe a student
 * 
 * @author yklowgonzalez0498
 *
 */
public class Student {
  private String name;
  private int age;
  private String studClassification;
  private String country;

  public void setName(String name) { // Using this in a constructor
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) { // Using this in a constructor
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setClassification(String studClassification) { // Using this in a constructor
    this.studClassification = studClassification;
  }

  public String getClassification() {
    return studClassification;
  }

  public void setCountry(String studc) {
    country = studc;
  }

  /*
   * @param na the name of the student
   * @param ag age of the student
   * @param studCl student classification
   * @param co student's country
   */
  public Student(String na, int ag, String studCl, String co) { // Student constructor
    name = na;
    age = ag;
    studClassification = studCl;
    country = co;
  }

  public Student(String na, int ag, String studCl) { // Student constructor(overloading)
    name = na;
    age = ag;
    studClassification = studCl;
  }

  public String getInfo() {
    return "1." + name + "\n2." + age + "\n3." + studClassification + "\n4." + country;
  }
}
