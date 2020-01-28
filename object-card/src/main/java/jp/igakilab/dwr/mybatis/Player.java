package jp.igakilab.dwr.mybatis;

/**
 * Player
 */
public class Player {
  private String player = new String();
  private int plyHP;
  private int result;

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public int getPlyHP() {
    return plyHP;
  }

  public void setPlyHP(int plyHP) {
    this.plyHP = plyHP;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
