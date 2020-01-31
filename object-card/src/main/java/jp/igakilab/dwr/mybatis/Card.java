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
  private int FLY;
  private int PHS;
  private int MAG;

  public Card(String player, int endCheck, int result) {
    this.player = player;
    this.endCheck = endCheck;
    this.result = result;
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

  public int getFLY() {
    return FLY;
  }

  public void setFLY(int FLY) {
    this.FLY = FLY;
  }

  public int getPHS() {
    return PHS;
  }

  public void setPHS(int PHS) {
    this.PHS = PHS;
  }

  public int getMAG() {
    return MAG;
  }

  public void setMAG(int MAG) {
    this.MAG = MAG;
  }
}
