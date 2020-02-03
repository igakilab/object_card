package jp.igakilab.dwr.mybatis;

//phs
public class Phs {
  private int id;
  private int phs;

  public Phs(int id, int phs) {
    this.id = id;
    this.phs = phs;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPhs() {
    return phs;
  }

  public void setPhs(int phs) {
    this.phs = phs;
  }
}
