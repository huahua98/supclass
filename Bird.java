public class Bird{
  
   public enum WING{USEFUL,USELESS};
   public enum Gender{MALE, FEMALE};
  
  private WING wing;
  private int age;
  private String name;
  private Gender gender;
  
  public Bird(WING wing,Gender gender, int age, String name){
    this.wing = wing;
    this.age = age;
    this.name = name;
    this.gender = gender;
  }
  
  
  public WING getWing(){return this.wing;}
  public Gender getGender(){return this.gender;}
  public int getAge(){return this.age;}
  public String getName(){return this.name;}
  
  
  
}