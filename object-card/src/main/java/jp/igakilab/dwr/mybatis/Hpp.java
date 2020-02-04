package jp.igakilab.dwr.mybatis;

public class Hpp {
  private int id;
  private int hp;

  public Hpp(int id, int hp) {
    this.id = id;
    this.hp = hp;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
