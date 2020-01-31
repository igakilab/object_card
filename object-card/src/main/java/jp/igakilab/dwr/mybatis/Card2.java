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
  private int FLY;
  private int PHS;
  private int MAG;

  public Card2(String player, int endCheck2, int result2) {
    this.player = player;
    this.endCheck2 = endCheck2;
    this.result2 = result2;
  }

  public Card2(String player, int endCheck2, int result2, int FLY, int PHS, int MAG) {
    this.player = player;
    this.endCheck2 = endCheck2;
    this.result2 = result2;
    this.FLY = FLY;
    this.PHS = PHS;
    this.MAG = MAG;
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
    return FLY;
  }

  public void setFly(int FLY) {
    this.FLY = FLY;
  }

  public int getPhs() {
    return PHS;
  }

  public void setPhs(int PHS) {
    this.PHS = PHS;
  }

  public int getMag() {
    return MAG;
  }

  public void setMag(int MAG) {
    this.MAG = MAG;
  }
}
