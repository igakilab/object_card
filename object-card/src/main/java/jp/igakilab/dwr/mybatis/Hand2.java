package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand2
 */
public class Hand2 {
  private int id;
  private String player = new String();
  private int endcheck2;
  private int result2;
  private ArrayList<Integer> hp = new ArrayList<>();
  private ArrayList<Integer> atk = new ArrayList<>();
  private ArrayList<String> type = new ArrayList<>();
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

  public int getEndcheck2() {
    return endcheck2;
  }

  public void setEndcheck2(int endcheck2) {
    this.endcheck2 = endcheck2;
  }

  public int getResult2() {
    return result2;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
  }

  public ArrayList<Integer> getHp() {
    return hp;
  }

  public void setHp(ArrayList<Integer> hp) {
    this.hp = hp;
  }

  public ArrayList<Integer> getAtk() {
    return atk;
  }

  public void setAtk(ArrayList<Integer> atk) {
    this.atk = atk;
  }

  public ArrayList<String> getType() {
    return type;
  }

  public void setType(ArrayList<String> type) {
    this.type = type;
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
