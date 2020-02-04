package jp.igakilab.dwr.mybatis;

/**
 * Card2
 */
public class Card2 {
  private int id;
  private String player = "";
  private int endcheck2;
  private int result2;
  private int hp;
  private int atk;
  private String type;
  private int fly;
  private int phs;
  private int mag;
  private String name;

  public Card2(String player, int endcheck2, int result2) {
    this.player = player;
    this.endcheck2 = endcheck2;
    this.result2 = result2;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public int getEndcheck2() {
    return endcheck2;
  }

  public void setEndcheck2(int endcheck2) {
    this.endcheck2 = endcheck2;
  }

  public int getResult2() {
    return result2;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getAtk() {
    return atk;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getFly() {
    return fly;
  }

  public void setFly(int fly) {
    this.fly = fly;
  }

  public int getPhs() {
    return phs;
  }

  public void setPhs(int phs) {
    this.phs = phs;
  }

  public int getMag() {
    return mag;
  }

  public void setMag(int mag) {
    this.mag = mag;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
