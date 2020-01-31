package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand2
 */
public class Hand2 {
  private int id;
  private String player = new String();
  private int endCheck2;
  private int result2;
  private ArrayList<Integer> HP = new ArrayList<>();
  private ArrayList<Integer> ATK = new ArrayList<>();
  private ArrayList<String> TYPE = new ArrayList<>();
  private ArrayList<Integer> fly = new ArrayList<>();
  private ArrayList<Integer> phs = new ArrayList<>();
  private ArrayList<Integer> mag = new ArrayList<>();

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

  public int getEndCheck2() {
    return endCheck2;
  }

  public void setEndCheck2(int endCheck2) {
    this.endCheck2 = endCheck2;
  }

  public int getResult2() {
    return result2;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
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
    return fly;
  }

  public void setFly(ArrayList<Integer> fly) {
    this.fly = fly;
  }

  public ArrayList<Integer> getPhs() {
    return phs;
  }

  public void setPhs(ArrayList<Integer> phs) {
    this.phs = phs;
  }

  public ArrayList<Integer> getMag() {
    return mag;
  }

  public void setMag(ArrayList<Integer> mag) {
    this.mag = mag;
  }
}
