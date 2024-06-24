
package vehicles;

import org.json.JSONObject;


/**
 *
 * @author Leandro Gómez.
 */
public class Vehicle {
    
    protected enum Colors 
    {
        WHITE, BLACK, GRAY, SILVER, RED, BLUE, GREEN, YELLOW,
        ORANGE, BROWN, BEIGE, GOLD, PURPUL, PINK, TURQUOISE,
        BRONZE, BURGUNDY, CREAM, COPPER, METALIC_SILVER,
        BLACK_AND_WHITE, RED_AND_BLACK, BLUE_AND_WHITE,
        WHITE_AND_SILVER, BLACK_AND_SILVER, RED_AND_WHITE,
        YELLOW_AND_BLACK, GRAY_AND_BLACK, WHITE_AND_BLACK,
        BLUE_AND_SILVER, GREEN_AND_WHITE, WHITE_AND_BLUE,
        BLACK_AND_GOLD, ORANGE_AND_BLACK, BLACK_AND_GRAY,
        BLACK_AND_RED, BLUE_AND_BLACK, WHITE_AND_RED,
        WHITE_AND_YELLOW, RED_AND_SILVER
    };
    
    protected String brand = "";
    protected String colorName = "";
    protected String description = "";
    protected String energySource = "";
    protected String loadCapacity = "";
    protected String model = "";
    protected String name = "";
    protected String speed = "";
    protected String weight = "";
    protected int wheels = 0;
    protected int year = 0;
    
    public Vehicle(int year, String name, String model, String brand){
        this.year = year;
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setColor(Colors color){
        this.colorName = color.toString();
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }
    
    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public JSONObject buildJSONDescription(){
        JSONObject data = new JSONObject();
        
        data.put("Brand", brand);
        data.put("Name", name);
        data.put("Model", model);
        data.put("Year", year);
        data.put("Color", colorName);
        data.put("Load Capacity", loadCapacity);
        data.put("Speed", speed);
        data.put("Weight", weight);
        
        return data;
    }
}
