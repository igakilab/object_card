package jp.igakilab.dwr.mybatis;

//FLY
public class FLYER {
  private int id;
  private int FLY;

  public FLYER(int id, int FLY) {
    this.id = id;
    this.FLY = FLY;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getFLY() {
    return FLY;
  }

  public void setFLY(int FLY) {
    this.FLY = FLY;
  }
}
