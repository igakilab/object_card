package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand
 */
public class Hand {

  private ArrayList<String> handno = new ArrayList<>();
  private String player = new String();
  private int end_check;

  public int getEnd_check() {
    return end_check;
  }

  public void setEnd_check(int end_check) {
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
