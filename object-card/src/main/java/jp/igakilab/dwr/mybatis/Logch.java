package jp.igakilab.dwr.mybatis;

/**
 * Log
 */
public class Logch {
  private int logid;
  private String log = new String();

  public Logch(int logid, String log) {
    this.logid = logid;
    this.log = log;
  }

  public int getLogid() {
    return logid;
  }

  public void setLogid(int logid) {
    this.logid = logid;
  }

  public String getLog() {
    return log;
  }

  public void setLogs(String log) {
    this.log = log;
  }
}
