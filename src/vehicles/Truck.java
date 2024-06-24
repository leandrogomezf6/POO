
package vehicles;

import org.json.JSONObject;

/**
 *
 * @author Leandro Gómez.
 */
public class Truck extends Vehicle {

    private final String grearbox = "manual";
    private String engine = "";
    private String power = "";
    
    public Truck(int year, String name, String model, String brand) {
        super(year, name, model, brand);
        
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPower(String power) {
        this.power = power;
    }
    
    public void setWheels(int truckWheels){
        wheels = truckWheels;
    }

    @Override
    public JSONObject buildJSONDescription() {
        JSONObject data = super.buildJSONDescription();

        data.put("Engine", engine);
        data.put("Power", power);
        data.put("Grearbox", grearbox);

        return data;
    }
    
}
