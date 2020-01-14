package jp.igakilab.dwr.mybatis;

/**
 * Card2
 */
public class Card2 {
  private int id;
  private String handno = "";
  private String player = "";
  private int endCheck2;

  public Card2(int id, String handno, String player, int endCheck2) {
    this.id = id;
    this.handno = handno;
    this.player = player;
    this.endCheck2 = endCheck2;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getEndCheck2() {
    return endCheck2;
  }

  public void setEndCheck2(int endCheck2) {
    this.endCheck2 = endCheck2;
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
