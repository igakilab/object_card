package jp.igakilab.dwr.mybatis;

//PHS
public class PHS {
  private int id;
  private int PHS;

  public PHS(int id, int PHS) {
    this.id = id;
    this.PHS = PHS;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPHS() {
    return PHS;
  }

  public void setPHS(int PHS) {
    this.PHS = PHS;
  }
}
