// 🥷  access  modifier - class keyword - name of our class 
public class SuperHero{

    // 🥷  member variables : they are attributes / fields that belong to a class 
         // we can put an initial value or not as you wish 
        // by convention member variables always private
        private  String name;
        private int health;
        private int energy;
        private int ninjaStar;

    // 🥷 Next step : the constructor 
        // it's a special(no return type ) method in java  , it's used to initiate objects 
        // in py : __init__(self,param)  
    // access modifier nameOfThEmETHOD()
    public SuperHero(String name){
        // 🥷 this keyword is used just to refer to the member variable that belongs to the class 
this.name = name ;
this.health=100;
this.energy = 100;
this.ninjaStar=5;
    }

// 🥷  methods Part

// 🥷 Getters :method to return the value , because we declare it private  
// by convention we start with the word "get" followed by the name of the memeber variable 
   public String getName(){
    return this.name;
   }
    public int getHealth(){
    return this.health;
   }
    public int getEnergy(){
    return this.energy;
   }
    public int getNinjaStar(){
    return this.ninjaStar;
   }

   // 🥷 Setters : also methods it sets or update the value .
   public void  setName(String newName){
this.name =newName;
   }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setNinjaStar(int ninjaStar) {
        this.ninjaStar = ninjaStar;
    }

   // 🥷 the attack method 
   public void attack(SuperHero target){
    // the fighter will throw a ninjaStar 
    System.out.print(this.getName() + "  performs an attack");
    this.setNinjaStar(this.getNinjaStar()-1);
    // the fighter energy will decrease by 20 
this.setEnergy(this.getEnergy()-20);
    //the target health will decrease by 25
    int newTargetHelath=target.getHealth()-25;
    target.setHealth(newTargetHelath);

   }

   // method to display superHero infos 
   public void displayInfos(){
    String info = String.format("** Name : %s\n**Energy: %d\n**Health: %d\n**star count: %d", this.getName(),this.getEnergy(),this.getHealth(),this.getNinjaStar());
    System.out.println(info);
   }

   // 🥷 method overflow : means two or more methods have the same name  but not the same params 
   public void displayInfos(String test){
    String info = String.format("** Name : %s\n**Energy: %d\n**Health: %d\n**star count: %d", this.getName(),this.getEnergy(),this.getHealth(),this.getNinjaStar());
    System.out.println(test + "*****Overload***");
    System.out.println(info);
   }

   // static method : it's a method that belongs to the class => yo udon't need to create an instance to call it 

   public static void thisIsStatic(){
    System.out.println("This method belong to the class !!");
   }
   
}