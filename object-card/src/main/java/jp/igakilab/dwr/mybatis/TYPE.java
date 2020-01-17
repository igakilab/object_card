package jp.igakilab.dwr.mybatis;

public class TYPE {
  private int id;
  private String TYPE;

  public TYPE(int id, String TYPE) {
    this.id = id;
    this.TYPE = TYPE;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTYPE() {
    return TYPE;
  }

  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }
}
