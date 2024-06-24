
package vehicles;

import org.json.JSONObject;

/**
 *
 * @author Leandro Gómez.
 */
public class Motorcycle extends Vehicle {

    private String engine = "";
    private String power = "";
    private final String grearbox = "manual";
    
    public Motorcycle(int year, String name, String model, String brand) {
        super(year, name, model, brand);
        
        wheels = 2;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPower(String power) {
        this.power = power;
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
