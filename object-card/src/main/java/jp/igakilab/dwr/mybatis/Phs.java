package jp.igakilab.dwr.mybatis;

public class Phs {
  private int id;
  private int PHS;

  public Phs(int id, int PHS) {
    this.id = id;
    this.PHS = PHS;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPhs() {
    return PHS;
  }

  public void setPhs(int PHS) {
    this.PHS = PHS;
  }
}
