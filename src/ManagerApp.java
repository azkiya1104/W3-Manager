public class ManagerApp {
    public static void main (String[] args) throws Exception {
        Manager manager = new Manager("Azkiya", "google");
        manager.sayHello("Azkiya");
       
        

        VicePresident vp = new VicePresident("Azkiya", "google");
        vp.sayHello("Azkiya");

        
    }
    

}
