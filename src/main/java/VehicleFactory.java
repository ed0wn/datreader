import com.google.gson.Gson;

public class VehicleFactory implements BaseVehicleFactory {

  @Override
  public Vehicle createVehicle(String type, String id) {
    Vehicle vehicle;
    if (type.contains("auto")) {
      vehicle = new Gson().fromJson(type, Car.class);
      vehicle.setId(id);
    }else if (type.contains("bicikli")) {
      vehicle = new Gson().fromJson(type, Bicycle.class);
      vehicle.setId(id);
    }else {
        throw new IllegalArgumentException("No such Vehicle.");
    }
    return vehicle;
  }
}
