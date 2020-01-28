package jp.igakilab.dwr.mybatis;

public class ATK {
  private int id;
  private int ATK;

  public ATK(int id, int ATK) {
    this.id = id;
    this.ATK = ATK;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getATK() {
    return ATK;
  }

  public void setATK(int ATK) {
    this.ATK = ATK;
  }
}
