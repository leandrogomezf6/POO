package vehicles;

/**
 *
 * @author Leandro Gómez.
 */
public class Creator {
    public static void main(String[] args) {
        
        // Cars.
        
        Car corolla = new Car(2021, "Corolla", "corolla-2021", "Toyota");
        corolla.setColor(Vehicle.Colors.GRAY);
        corolla.setEngine("1.8L 4 cylinders");
        corolla.setGrearbox("manual");
        corolla.setEnergySource("Gasoline");
        corolla.setPower("139 hp");
        corolla.setLoadCapacity("430 kg");
        corolla.setSpeed("195 Km/h");
        corolla.setWeight("1,310 kg");
        
        Car camaro = new Car(2021, "Camaro", "camaro-2021", "Chevrolet");
        camaro.setColor(Vehicle.Colors.BLUE);
        camaro.setEngine("2.0L Turbo 4 cylinders");
        camaro.setGrearbox("manual");
        camaro.setEnergySource("Gasoline");
        camaro.setPower("275 hp");
        camaro.setLoadCapacity("380 kg");
        camaro.setSpeed("250 Km/h");
        camaro.setWeight("1,577 kg");
        
        // Trucks.
        
        Truck peterblit = new Truck(2021, "Peterblit", "579", "Peterblit");
        peterblit.setColor(Vehicle.Colors.RED);
        peterblit.setEngine("PACCAR MIX-13");
        peterblit.setEnergySource("Diesel");
        peterblit.setPower("500 hp");
        peterblit.setLoadCapacity("22,680 kg");
        peterblit.setSpeed("120 Km/h");
        peterblit.setWeight("8,800 kg");
        
        Truck freightliner = new Truck(2021, "Freightliner", "Cascadia", "Freightliner");
        freightliner.setColor(Vehicle.Colors.BLACK);
        freightliner.setEngine("Detroit DD15");
        freightliner.setEnergySource("Diesel");
        freightliner.setPower("500 hp");
        freightliner.setLoadCapacity("21,772 kg");
        freightliner.setSpeed("120 Km/h");
        freightliner.setWeight("8,000 kg");
        
        // Motorcycles.
            
        Motorcycle kawasaki = new Motorcycle(2021,"Kawasaki", "Ninja ZX-10R", "Kawasaki");
        kawasaki.setColor(Vehicle.Colors.BLACK_AND_GOLD);
        kawasaki.setEngine("4 stroke DOHC 998cc");
        kawasaki.setEnergySource("Gasoline");
        kawasaki.setPower("203 hp");
        kawasaki.setLoadCapacity("220 kg");
        kawasaki.setSpeed("299 Km/h");
        kawasaki.setWeight("207 kg");
        
        Motorcycle harley = new Motorcycle(2021,"Harley-Davidson", "Fat Boy", "Harley-Davidson");
        harley.setColor(Vehicle.Colors.BLACK_AND_SILVER);
        harley.setEngine("Milwaukee-Eight 114");
        harley.setEnergySource("Gasoline");
        harley.setPower("94 hp");
        harley.setLoadCapacity("220 kg");
        harley.setSpeed("177 Km/h");
        harley.setWeight("317 kg");
        
        
        // Cars descriptions.
        System.out.println(corolla.buildJSONDescription()+ "\n"); 
        System.out.println(camaro.buildJSONDescription()+ "\n");       

        // Trucks descriptions.
        System.out.println(peterblit.buildJSONDescription()+ "\n");
        System.out.println(freightliner.buildJSONDescription()+ "\n");
        
        // Motorcyle descriptions.
        System.out.println(kawasaki.buildJSONDescription()+ "\n");
        System.out.println(harley.buildJSONDescription()+ "\n");
    }
}
