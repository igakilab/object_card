package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Hand
 */
public class Hand {
  private int id;
  private String player = new String();
  private int endcheck;
  private int result;
  private ArrayList<Integer> hp = new ArrayList<>();
  private ArrayList<Integer> atk = new ArrayList<>();
  private ArrayList<String> type = new ArrayList<>();
  private ArrayList<Integer> fly = new ArrayList<>();
  private ArrayList<Integer> phs = new ArrayList<>();
  private ArrayList<Integer> mag = new ArrayList<>();
  private ArrayList<String> name = new ArrayList<>();

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

  public int getEndcheck() {
    return endcheck;
  }

  public void setEndcheck(int endcheck) {
    this.endcheck = endcheck;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
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

  public ArrayList<String> getName() {
    return name;
  }

  public void setName(ArrayList<String> name) {
    this.name = name;
  }

}
