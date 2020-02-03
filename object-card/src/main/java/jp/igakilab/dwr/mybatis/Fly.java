package jp.igakilab.dwr.mybatis;

//fly
public class Fly {
  private int id;
  private int fly;

  public Fly(int id, int fly) {
    this.id = id;
    this.fly = fly;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getFly() {
    return fly;
  }

  public void setFly(int fly) {
    this.fly = fly;
  }
}
