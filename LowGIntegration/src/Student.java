
/**
 * Object class to describe a student that is currently using the app "My French Brain".
 * It fills 4 fields: first name, age, student's classification, and country. 
 * @author Kristy Low
 *
 */
public class Student {
  private String name;
  private int age;
  private String studClassification;
  private String country;

  /**
   * Sets the first name of the student.
   * @param name is the first name of the student.
   */
  public void setName(String name) { // Using this in a constructor
    this.name = name;
  }

  /**
   * Gets the first name of the student.
   * @return this student's first name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the age of the student.
   * @param age of the student.
   */
  public void setAge(int age) { // Using this in a constructor
    this.age = age;
  }

  /**
   * Gets the age of the student.
   * @return age of this student.
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets the current classification of the student in the University: freshman, sophomore, junior, 
   * or senior.
   * @param studClassification of the current student.
   */
  public void setClassification(String studClassification) { // Using this in a constructor
    this.studClassification = studClassification;
  }

  /**
   * Gets the classification of the student.
   * @return student's classification.
   */
  public String getClassification() {
    return studClassification;
  }

  /**
   * Sets student's country of Birth.
   * @param studc student's country.
   */
  public void setCountry(String studc) {
    country = studc;
  }
  
  /**
   * Gets the Student's country of Birth.
   * @return student's country.
   */
  public String getCountry() {
    return country;
  }

  /**
   * Student constructor with all 4 parameters.
   * @param na the name of the student.
   * @param ag age of the student.
   * @param studCl student classification: freshman, sophomore, junior, or senior.
   * @param co student's country.
   */
  public Student(String na, int ag, String studCl, String co) { // Student constructor
    name = na;
    age = ag;
    studClassification = studCl;
    country = co;
  }

  /**
   * Student constructor with only 3 parameters. Country is missing.
   * @param na student's first name.
   * @param ag student's age.
   * @param studCl student's classification: freshman, sophomore, junior, or senior. 
   */
  public Student(String na, int ag, String studCl) { // Student constructor(overloading)
    name = na;
    age = ag;
    studClassification = studCl;
  }

  /**
   * Gets the complete info provided by our student.
   * @return all the info provided by our student.
   */
  public String getInfo() {
    return "1." + name + "\n2." + age + "\n3." + studClassification + "\n4." + country;
  }
}
