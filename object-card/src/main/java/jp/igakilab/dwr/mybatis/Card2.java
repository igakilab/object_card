package jp.igakilab.dwr.mybatis;

/**
 * Card2
 */
public class Card2 {
  private int id;
  private String player = "";
  private int endCheck2;
  private int result2;
  private int HP;
  private int ATK;
  private String TYPE;
  private int fly;
  private int phs;
  private int mag;

  public Card2(String player, int endCheck2, int result2) {
    this.player = player;
    this.endCheck2 = endCheck2;
    this.result2 = result2;
  }

  public Card2(String player, int endCheck2, int result2, int fly, int phs, int mag) {
    this.player = player;
    this.endCheck2 = endCheck2;
    this.result2 = result2;
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

  public int getEndCheck2() {
    return endCheck2;
  }

  public void setEndCheck2(int endCheck2) {
    this.endCheck2 = endCheck2;
  }

  public int getResult2() {
    return result2;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
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
