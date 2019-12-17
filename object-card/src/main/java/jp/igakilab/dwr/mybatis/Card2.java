package jp.igakilab.dwr.mybatis;

/**
 * Card2
 */
public class Card2 {
  private String handno = "";
  private String player = "";
  private int end_check2;

  public Card2(String handno, String player, int end_check2) {
    this.handno = handno;
    this.player = player;
    this.end_check2 = end_check2;
  }

  public int getEndCheck2() {
    return end_check2;
  }

  public void setEndCheck2(int end_check2) {
    this.end_check2 = end_check2;
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
