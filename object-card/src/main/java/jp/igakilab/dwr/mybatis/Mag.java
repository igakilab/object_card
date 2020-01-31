package jp.igakilab.dwr.mybatis;

public class Mag {
  private int id;
  private int MAG;

  public Mag(int id, int MAG) {
    this.id = id;
    this.MAG = MAG;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMag() {
    return MAG;
  }

  public void setMag(int MAG) {
    this.MAG = MAG;
  }
}
