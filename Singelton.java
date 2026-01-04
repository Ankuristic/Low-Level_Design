package lowleveldesign.singletondesignpattern;

public class Singelton {   
    
    //Step2: Create a static var to hold one instance of Singleton class.




    private static Singelton singelton;
 
        //Step1: We have created a private constructor of Singleton class & it can only be instantiated within this class.

    private Singelton() {
        System.out.println("I AM CREATING Singleton");
    }

    //     //Step3: Create a static getInstance() method to instantiate the class and also to return an instance of it.

    public static Singelton getInstance() {
        if (singelton == null) {
            singelton = new Singelton();
        }
        return singelton;
    }
}
