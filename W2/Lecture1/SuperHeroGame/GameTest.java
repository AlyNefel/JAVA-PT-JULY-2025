public class GameTest {
    public static void main(String[] args) {
        System.out.println("Executed !");
        // we will create an instance of the SuperHero class 
        SuperHero tunisianMan = new SuperHero("tunisianMan");
        SuperHero ironMan = new SuperHero("Iron Man");
         System.out.println("***************");
         // 🥷 to access the member variable of an object we use  the "." notation if it's not private 
         System.out.println(tunisianMan.getName());
         tunisianMan.setName("Rayen");
         System.out.println("After using setter " +tunisianMan.getName());
       System.out.println("*******Infos before Attack********");
       tunisianMan.displayInfos();
       ironMan.displayInfos();
       // 🥷 perform the attack by tunisianMan
       tunisianMan.attack(ironMan);
         System.out.println("*******Infos after Attack********");
tunisianMan.displayInfos();
       ironMan.displayInfos();
 tunisianMan.attack(ironMan);
  System.out.println("*******Infos after second Attack********");
  tunisianMan.displayInfos();
       ironMan.displayInfos();
       ironMan.displayInfos("Test OverFlow !! here is another display method");

    SuperHero.thisIsStatic();  
    // 🥷 we can call it from the instance but it will throw a warning  
    ironMan.thisIsStatic(); 
    }
}
