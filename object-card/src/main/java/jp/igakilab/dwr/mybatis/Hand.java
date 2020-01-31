package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand
 */
public class Hand {
  private int id;
  private String player = new String();
  private int endCheck;
  private int result;
  private ArrayList<Integer> HP = new ArrayList<>();
  private ArrayList<Integer> ATK = new ArrayList<>();
  private ArrayList<String> TYPE = new ArrayList<>();
  private ArrayList<Integer> FLY = new ArrayList<>();
  private ArrayList<Integer> PHS = new ArrayList<>();
  private ArrayList<Integer> MAG = new ArrayList<>();

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

  public int getEndCheck() {
    return endCheck;
  }

  public void setEndCheck(int endCheck) {
    this.endCheck = endCheck;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public ArrayList<Integer> getHP() {
    return HP;
  }

  public void setHP(ArrayList<Integer> HP) {
    this.HP = HP;
  }

  public ArrayList<Integer> getATK() {
    return ATK;
  }

  public void setATK(ArrayList<Integer> ATK) {
    this.ATK = ATK;
  }

  public ArrayList<String> getTYPE() {
    return TYPE;
  }

  public void setTYPE(ArrayList<String> TYPE) {
    this.TYPE = TYPE;
  }

  public ArrayList<Integer> getFly() {
    return FLY;
  }

  public void setFly(ArrayList<Integer> FLY) {
    this.FLY = FLY;
  }

  public ArrayList<Integer> getPhs() {
    return PHS;
  }

  public void setPhs(ArrayList<Integer> PHS) {
    this.PHS = PHS;
  }

  public ArrayList<Integer> getMag() {
    return MAG;
  }

  public void setMag(ArrayList<Integer> MAG) {
    this.MAG = MAG;
  }

}
