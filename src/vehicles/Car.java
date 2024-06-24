
package vehicles;

import org.json.JSONObject;

/**
 *
 * @author Leandro Gómez.
 */
public class Car extends Vehicle{   
    
    private String engine = "";
    private String power = "";
    private String grearbox = "";
    
    public Car(int year, String name, String model, String brand){
        super(year, name, model, brand);
        
        wheels = 4;
        
    }

    public void setEngine(String engine) {
        this.engine = "Engine " + engine;
    }
    
    public void setPower(String power) {
        this.power = power;
    }

    public void setGrearbox(String grearbox) {
        this.grearbox = grearbox;
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
