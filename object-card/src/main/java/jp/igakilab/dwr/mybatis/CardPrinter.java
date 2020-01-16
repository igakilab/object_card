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
        System.out.println(f.getId());
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck());
        System.out.println(f.getHP());
        System.out.println(f.getATK());
        System.out.println(f.getTYPE());
      }
    }
    return handList;
  }

  public List<Card2> execute2() {
    List<Card2> handList2 = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      handList2 = session.selectList("igakilab.mybatis.CardMapper.selectHand2");
      for (Card2 f : handList2) {
        System.out.println(f.getId());
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

  public void updateHand(Hand handList) {
    try (SqlSession session = factory.openSession()) {
      String player = handList.getPlayer();
      int endCheck = handList.getEndCheck();
      for (int id = handList.getId(); id <= 5; id++) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateHand", new Card(id, player, endCheck));
        System.out.println(ret);
      }
      int hpid = 1;
      for (int HP : handList.getHP()) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateHP", new Card(hpid, HP));
        System.out.println(ret);
        hpid++;
      }
      int typeid = 1;
      for (String TYPE : handList.getTYPE()) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateTYPE", new Card(typeid, TYPE));
        System.out.println(ret);
        typeid++;
      }
      session.commit();
    }
  }

  /**
   *
   * @param handList2
   */

  public void updateHand2(Hand2 handList2) {
    try (SqlSession session = factory.openSession()) {
      int id = handList2.getId();
      String player = handList2.getPlayer();
      int endCheck2 = handList2.getEndCheck2();
      for (String i : handList2.getHandno()) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateHand2", new Card2(id, i, player, endCheck2));// 1つずつupdate
        System.out.println(ret);
        id++;
      }
      session.commit();
    }
  }

  public static void main(String[] args) {
    CardPrinter pp = new CardPrinter();
    pp.execute();
  }

}
