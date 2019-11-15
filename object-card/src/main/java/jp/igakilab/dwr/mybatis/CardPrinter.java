package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CardPrinter {
  SqlSessionFactory factory = DBUtility.getSqlSessionFactory();

  public List<Player> execute() {
    List<Player> playerList = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      playerList = session.selectList("igakilab.mybatis.CardMapper.selectPlayer");
      for (Player f : playerList) {
        System.out.println(f.getName());
        System.out.println(f.getNo());
      }
    }
    return playerList;
  }

  /**
   * Playerクラスと同じデータ構造のオブジェクトをJSから受け取り，拡張for文で1つずつinsertする例
   *
   * @param playerList
   */
  public void insertPlayer(ArrayList<Player> playerList) {
    try (SqlSession session = factory.openSession()) {
      for (Player f : playerList) {
        int ret = session.insert("igakilab.mybatis.CardMapper.insertPlayer", f);// 1つずつinsert
        System.out.println("Return:" + ret);
        System.out.println(f.getNo());
        System.out.println(f.getName());
      }
      session.commit();// これを呼び出すと書き込まれる
    }
  }

  public void insertDeck(Deck deck) {
    System.out.println(deck.getName());
    for (Integer i : deck.getCards()) {
      System.out.print(i);
    }
  }

  public static void main(String[] args) {
    CardPrinter pp = new CardPrinter();
    pp.execute();
  }

}
