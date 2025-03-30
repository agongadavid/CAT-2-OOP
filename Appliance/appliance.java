package Appliance;

public abstract class appliance {
    
    //abstract method
    public abstract void turnOn();
}

public static void main (String[]args){
     public static void main(String[] args) {
        
        //intanciated objects
        appliance myAppliance;

        myAppliance = new Fan();
        myAppliance.turnOn();
        myAppliance = new TV();
        myAppliance.turnOn();
    }
}