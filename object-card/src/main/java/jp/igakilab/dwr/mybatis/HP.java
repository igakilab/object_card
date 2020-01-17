package jp.igakilab.dwr.mybatis;

public class HP {
  private int id;
  private int HP;

  public HP(int id, int HP) {
    this.id = id;
    this.HP = HP;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }
}
