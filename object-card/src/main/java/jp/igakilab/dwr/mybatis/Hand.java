package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand
 */
public class Hand {

  private ArrayList<String> handno = new ArrayList<>();
  private String player = new String();
  private int end_check;

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

  public ArrayList<String> getHandno() {
    return handno;
  }

  public void setHandno(ArrayList<String> handno) {
    this.handno = handno;
  }

}
