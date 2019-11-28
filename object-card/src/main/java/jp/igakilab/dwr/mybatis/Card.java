package jp.igakilab.dwr.mybatis;

/**
 * Card
 */
public class Card {
  private String handno = "";
  private String player = "";
  private int end_check;

  public Card(String handno, String player, int end_check) {
    this.handno = handno;
    this.player = player;
    this.end_check = end_check;
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
