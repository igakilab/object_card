package jp.igakilab.dwr.mybatis;

/**
 * Card
 */
public class Card {
  private int id;
  private String handno = "";
  private String player = "";
  private int end_check;

  public Card(int id, String handno, String player, int end_check) {
    this.id = id;
    this.handno = handno;
    this.player = player;
    this.end_check = end_check;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getEndCheck() {
    return end_check;
  }

  public void setEndCheck(int end_check) {
    this.end_check = end_check;
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
