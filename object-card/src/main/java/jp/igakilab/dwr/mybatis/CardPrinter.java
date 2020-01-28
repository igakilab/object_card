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
        System.out.println(f.getResult());
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
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck2());
        System.out.println(f.getResult2());
        System.out.println(f.getHP());
        System.out.println(f.getATK());
        System.out.println(f.getTYPE());
      }
    }
    return handList2;
  }

  public List<Player> plyexe() {
    List<Player> playerList = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      playerList = session.selectList("igakilab.mybatis.CardMapper.selectPlayer");
      for (Player f : playerList) {
        System.out.println(f.getPlayer());
        System.out.println(f.getPlyHP());
        System.out.println(f.getResult());
      }
    }
    return playerList;
  }

  public List<Logch> logexe() {
    List<Logch> logList = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      logList = session.selectList("igakilab.mybatis.CardMapper.selectLog");
      for (Logch f : logList) {
        System.out.println(f.getLogid());
        System.out.println(f.getLog());
      }
    }
    return logList;
  }

  /**
   *
   * @param handList
   */
  public void updateHand(Hand handList) {
    try (SqlSession session = factory.openSession()) {
      String player = handList.getPlayer();
      int endCheck = handList.getEndCheck();
      int result = handList.getResult();
      int hpid = handList.getId(), atkid = handList.getId(), typeid = handList.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateHand", new Card(player, endCheck, result));
      System.out.println(ret);

      for (int HP : handList.getHP()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHP", new HP(hpid, HP));
        System.out.println(hpret);
        hpid++;
      }
      for (int ATK : handList.getATK()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateATK", new ATK(atkid, ATK));
        System.out.println(atkret);
        atkid++;
      }
      for (String TYPE : handList.getTYPE()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateTYPE", new TYPE(typeid, TYPE));
        System.out.println(typeret);
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
      String player = handList2.getPlayer();
      int endCheck2 = handList2.getEndCheck2();
      int result2 = handList2.getResult2();
      int hpid = handList2.getId(), atkid = handList2.getId(), typeid = handList2.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateHand2", new Card2(player, endCheck2, result2));
      System.out.println(ret);

      for (int HP : handList2.getHP()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHP2", new HP(hpid, HP));
        System.out.println(hpret);
        hpid++;
      }
      for (int ATK : handList2.getATK()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateATK2", new ATK(atkid, ATK));
        System.out.println(atkret);
        atkid++;
      }
      for (String TYPE : handList2.getTYPE()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateTYPE2", new TYPE(typeid, TYPE));
        System.out.println(typeret);
        typeid++;
      }
      session.commit();
    }
  }

  /**
   *
   * @param playerList
   */
  public void updatePlayer(Player playerList) {
    try (SqlSession session = factory.openSession()) {

      int ret = session.update("igakilab.mybatis.CardMapper.updatePlayer", playerList);
      System.out.println(ret);

      session.commit();
    }
  }

  public void updateLog(Log logList) {
    try (SqlSession session = factory.openSession()) {
      int logid = logList.getLogid();

      for (String i : logList.getLog()) {
        int ret = session.update("igakilab.mybatis.CardMapper.updateLog", new Logch(logid, i));
        System.out.println(ret);
        logid++;
      }

      session.commit();
    }
  }

  public void resetResult(Hand resetList) {
    try (SqlSession session = factory.openSession()) {
      String player = resetList.getPlayer();
      int endCheck = resetList.getEndCheck();
      int result = resetList.getResult();

      int ret = session.update("igakilab.mybatis.CardMapper.resetResult", new Card(player, endCheck, result));
      System.out.println(ret);
      session.commit();
    }
  }

  public void resetResult2(Hand2 resetList2) {
    try (SqlSession session = factory.openSession()) {
      String player = resetList2.getPlayer();
      int endCheck2 = resetList2.getEndCheck2();
      int result2 = resetList2.getResult2();

      int ret = session.update("igakilab.mybatis.CardMapper.resetResult2", new Card2(player, endCheck2, result2));
      System.out.println(ret);
      session.commit();
    }
  }

  public static void main(String[] args) {
    CardPrinter pp = new CardPrinter();
    pp.execute();
    pp.execute2();
    pp.plyexe();
  }

}
