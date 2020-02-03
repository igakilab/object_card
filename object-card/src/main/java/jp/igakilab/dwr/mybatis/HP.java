package jp.igakilab.dwr.mybatis;

public class Hp {
  private int id;
  private int hp;

  public Hp(int id, int hp) {
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
