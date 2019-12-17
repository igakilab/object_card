package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CardPrinter {
  SqlSessionFactory factory = DBUtility.getSqlSessionFactory();

  public List<Card> execute() {
    List<Card> handList = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      handList = session.selectList("igakilab.mybatis.CardMapper.selectHand");
      for (Card f : handList) {
        System.out.println(f.getHandno());
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck());
      }
    }
    return handList;
  }

  public List<Card2> execute2() {
    List<Card2> handList2 = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      handList2 = session.selectList("igakilab.mybatis.CardMapper.selectHand2");
      for (Card2 f : handList2) {
        System.out.println(f.getHandno());
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck2());
      }
    }
    return handList2;
  }

  /**
   *
   * @param handList
   */

  public void insertHand(Hand handList) {
    try (SqlSession session = factory.openSession()) {
      String player = handList.getPlayer();
      int end_check = handList.getEndCheck();
      System.out.println("player:" + player + ", end_check:" + end_check);
      for (String i : handList.getHandno()) {
        int ret = session.insert("igakilab.mybatis.CardMapper.insertHand", new Card(i, player, end_check));// 1つずつinsert
        System.out.println(ret);
      }
      session.commit();
    }
  }

  /**
   *
   * @param handList2
   */
  public void insertHand2(Hand handList2) {
    try (SqlSession session = factory.openSession()) {
      String player = handList2.getPlayer();
      int end_check2 = handList2.getEndCheck();
      System.out.println("player:" + player + ", end_check2" + end_check2);
      for (String i : handList2.getHandno()) {
        int ret = session.insert("igakilab.mybatis.CardMapper.insertHand2", new Card2(i, player, end_check2));// 1つずつinsert
        System.out.println(ret);
      }
      session.commit();
    }
  }

  public void updateHand(Hand handList) {
    try (SqlSession session = factory.openSession()) {
      String player = handList.getPlayer();
      int end_check = handList.getEndCheck();
      System.out.println("player:" + player + ", end_check" + end_check);
      for (String i : handList.getHandno()) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateHand", new Card(i, player, end_check));
        System.out.println(ret);
      }
      session.commit();
    }
  }

  public static void main(String[] args) {
    CardPrinter pp = new CardPrinter();
    pp.execute();
    pp.execute2();
  }

}
