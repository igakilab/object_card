package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand2
 */
public class Hand2 {
  private int id;
  private ArrayList<String> handno = new ArrayList<>();
  private String player = new String();
  private int endCheck2;

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

  public ArrayList<String> getHandno() {
    return handno;
  }

  public void setHandno(ArrayList<String> handno) {
    this.handno = handno;
  }

}
