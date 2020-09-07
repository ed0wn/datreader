public class Car implements Vehicle {

  private String id;
  private String type;
  private int ajtokSzama;
  private String marka;

  public Car(String id, String type, int ajtok_szama, String marka) {
    this.id = id;
    this.type = type;
    this.ajtokSzama = ajtok_szama;
    this.marka = marka;
  }


  public int getAjtokSzama() {
    return ajtokSzama;
  }


  @Override
  public String toString() {
    return ("id: "+getId()+", type: "+getType()+", ajtok_szama: "+ getAjtokSzama()+", marka: "+getMarka());
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
