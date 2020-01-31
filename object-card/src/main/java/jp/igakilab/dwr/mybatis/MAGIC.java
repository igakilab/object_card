package jp.igakilab.dwr.mybatis;

//MAG
public class MAGIC {
  private int id;
  private int MAG;

  public MAGIC(int id, int MAG) {
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
