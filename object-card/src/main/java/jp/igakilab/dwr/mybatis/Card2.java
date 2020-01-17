package jp.igakilab.dwr.mybatis;

/**
 * Card2
 */
public class Card2 {
  private int id;
  private String player = "";
  private int endCheck2;
  private int HP;
  private int ATK;
  private String TYPE;

  public Card2(String player, int endCheck2) {
    this.player = player;
    this.endCheck2 = endCheck2;
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
