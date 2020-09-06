public class Bicycle implements Vehicle {

  private String id;
  private String type;
  private int terhelhetoseg;
  private String marka;

  public Bicycle(String id, String type, int terhelhetoseg, String marka) {
    this.id = id;
    this.type = type;
    this.terhelhetoseg = terhelhetoseg;
    this.marka = marka;
  }


  public int getTerhelhetoseg() {
    return terhelhetoseg;
  }

  public void setTerhelhetoseg(int terhelhetoseg) {
    this.terhelhetoseg = terhelhetoseg;
  }


  @Override
  public String toString() {
    return ("id: " + getId() + ", type: " + getType() + ", terhelhetoseg: " + getTerhelhetoseg() + ", marka: " + getMarka());
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }
}
