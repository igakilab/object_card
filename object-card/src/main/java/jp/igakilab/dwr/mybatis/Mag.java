package jp.igakilab.dwr.mybatis;

public class Mag {
  private int id;
  private int mag;

  public Mag(int id, int mag) {
    this.id = id;
    this.mag = mag;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMag() {
    return mag;
  }

  public void setMag(int mag) {
    this.mag = mag;
  }
}
