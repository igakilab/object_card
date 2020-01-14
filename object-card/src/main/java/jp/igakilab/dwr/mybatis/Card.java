package jp.igakilab.dwr.mybatis;

/**
 * Card
 */
public class Card {
  private int id;
  private String handno = "";
  private String player = "";
  private int endCheck;

  public Card(int id, String handno, String player, int endCheck) {
    this.id = id;
    this.handno = handno;
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

  public String getHandno() {
    return handno;
  }

  public void setHandno(String handno) {
    this.handno = handno;
  }

}
