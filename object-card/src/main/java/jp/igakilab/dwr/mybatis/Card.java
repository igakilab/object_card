package jp.igakilab.dwr.mybatis;

/**
 * Card
 */
public class Card {
  private int id;
  private String player = "";
  private int endCheck;
  private int HP;
  private int ATK;
  private String TYPE = "";

  public Card(int id, int para) {
    this.id = id;
    this.HP = para;
  }

  public Card(int id, String TYPE) {
    this.id = id;
    this.TYPE = TYPE;
  }

  public Card(int id, String player, int endCheck) {
    this.id = id;
    this.player = player;
    this.endCheck = endCheck;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getEndCheck() {
    return endCheck;
  }

  public void setEndCheck(int endCheck) {
    this.endCheck = endCheck;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
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

}
