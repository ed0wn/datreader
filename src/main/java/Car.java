public class Car implements Vehicle {

  private String id;
  private String type;
  private int ajtok_szama;
  private String marka;

  public Car(String id, String type, int ajtok_szama, String marka) {
    this.id = id;
    this.type = type;
    this.ajtok_szama = ajtok_szama;
    this.marka = marka;
  }


  public int getAjtok_szama() {
    return ajtok_szama;
  }


  @Override
  public String toString() {
    return ("id: "+getId()+", type: "+getType()+", ajtok_szama: "+getAjtok_szama()+", marka: "+getMarka());
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
