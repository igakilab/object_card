package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;

/**
 * Log
 */
public class Log {
  private int logid;
  private ArrayList<String> log = new ArrayList<>();

  public int getLogid() {
    return logid;
  }

  public void setLogid(int logid) {
    this.logid = logid;
  }

  public ArrayList<String> getLog() {
    return log;
  }

  public void setLog(ArrayList<String> log) {
    this.log = log;
  }
}
