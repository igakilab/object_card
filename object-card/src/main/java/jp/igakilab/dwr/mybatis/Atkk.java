package jp.igakilab.dwr.mybatis;

public class Atkk {
  private int id;
  private int atk;

  public Atkk(int id, int atk) {
    this.id = id;
    this.atk = atk;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAtk() {
    return atk;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }
}
