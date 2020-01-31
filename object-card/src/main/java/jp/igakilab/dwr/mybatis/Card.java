package jp.igakilab.dwr.mybatis;

/**
 * Card
 */
public class Card {
  private int id;
  private String player = "";
  private int endCheck;
  private int result;
  private int HP;
  private int ATK;
  private String TYPE;
  private int fly;
  private int phs;
  private int mag;

  public Card(String player, int endCheck, int result) {
    this.player = player;
    this.endCheck = endCheck;
    this.result = result;
  }

  public Card(String player, int endCheck, int result, int fly, int phs, int mag) {
    this.player = player;
    this.endCheck = endCheck;
    this.result = result;
    this.fly = fly;
    this.phs = phs;
    this.mag = mag;
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

  public int getEndCheck() {
    return endCheck;
  }

  public void setEndCheck(int endCheck) {
    this.endCheck = endCheck;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }

  public int getATK() {
    return ATK;
  }

  public void setATK(int ATK) {
    this.ATK = ATK;
  }

  public String getTYPE() {
    return TYPE;
  }

  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
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
}
