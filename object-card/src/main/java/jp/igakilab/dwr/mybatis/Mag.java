package jp.igakilab.dwr.mybatis;

//MAG
public class MAG {
  private int id;
  private int MAG;

  public MAG(int id, int MAG) {
    this.id = id;
    this.MAG = MAG;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMAG() {
    return MAG;
  }

  public void setMAG(int MAG) {
    this.MAG = MAG;
  }
}
