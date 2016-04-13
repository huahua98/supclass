public class USEFUL extends Bird{
  
  public enum Variety{CARINATHE};
  
  private Variety variety;
  private int age;
  private String name;
  
   public Useful wing(WING wing,Gender gender, int age, String name, Variety variety, int age, String name){
    super(wing, age, name);
    this.variety = variety;
    this.age = age;
    this.name = name;
    
    
  public Variety variety(){return this.variety;}
  public int age(){return this.age;}
  public String name(){return this.name;} 
   }
  