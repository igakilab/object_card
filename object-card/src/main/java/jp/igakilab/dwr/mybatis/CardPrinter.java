package jp.igakilab.dwr.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CardPrinter {
  SqlSessionFactory factory = DBUtility.getSqlSessionFactory();

  public List<Card> execute() {
    List<Card> fieldList = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      fieldList = session.selectList("igakilab.mybatis.CardMapper.selectHand");
      for (Card f : fieldList) {
        System.out.println(f.getId());
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck());
        System.out.println(f.getResult());
        System.out.println(f.getHP());
        System.out.println(f.getATK());
        System.out.println(f.getTYPE());
      }
    }
    return fieldList;
  }

  public List<Card2> execute2() {
    List<Card2> fieldList2 = new ArrayList<>();
    try (SqlSession session = factory.openSession()) {
      fieldList2 = session.selectList("igakilab.mybatis.CardMapper.selectHand2");
      for (Card2 f : fieldList2) {
        System.out.println(f.getId());
        System.out.println(f.getPlayer());
        System.out.println(f.getEndCheck2());
        System.out.println(f.getResult2());
        System.out.println(f.getHP());
        System.out.println(f.getATK());
        System.out.println(f.getTYPE());
      }
    }
    return fieldList2;
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
   * @param fieldList
   */
  public void updateField(Hand fieldList) {
    try (SqlSession session = factory.openSession()) {
      String player = fieldList.getPlayer();
      int endCheck = fieldList.getEndCheck();
      int result = fieldList.getResult();
      int hpid = fieldList.getId(), atkid = fieldList.getId(), typeid = fieldList.getId();
      int flyid = fieldList.getId(), phsid = fieldList.getId(), magid = fieldList.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateField", new Card(player, endCheck, result));
      System.out.println(ret);

      for (int HP : fieldList.getHP()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHP", new HP(hpid, HP));
        System.out.println(hpret);
        hpid++;
      }
      for (int ATK : fieldList.getATK()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateATK", new ATK(atkid, ATK));
        System.out.println(atkret);
        atkid++;
      }
      for (String TYPE : fieldList.getTYPE()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateTYPE", new TYPE(typeid, TYPE));
        System.out.println(typeret);
        typeid++;
      }
      for (int fly : fieldList.getFly()) {
        int flyret = session.update("igakilab.mybatis.CardMapper.updateFly", new Fly(flyid, fly));
        System.out.println(flyret);
        flyid++;
      }
      for (int phs : fieldList.getPhs()) {
        int phsret = session.update("igakilab.mybatis.CardMapper.updatePhs", new Phs(phsid, phs));
        System.out.println(phsret);
        phsid++;
      }
      for (int mag : fieldList.getMag()) {
        int magret = session.update("igakilab.mybatis.CardMapper.updateMag", new Mag(magid, mag));
        System.out.println(magret);
        magid++;
      }
      session.commit();
    }
  }

  /**
   *
   * @param fieldList2
   */
  public void updateField2(Hand2 fieldList2) {
    try (SqlSession session = factory.openSession()) {
      String player = fieldList2.getPlayer();
      int endCheck2 = fieldList2.getEndCheck2();
      int result2 = fieldList2.getResult2();
      int hpid = fieldList2.getId(), atkid = fieldList2.getId(), typeid = fieldList2.getId();
      int flyid = fieldList2.getId(), phsid = fieldList2.getId(), magid = fieldList2.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateField2", new Card2(player, endCheck2, result2));
      System.out.println(ret);

      for (int HP : fieldList2.getHP()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHP2", new HP(hpid, HP));
        System.out.println(hpret);
        hpid++;
      }
      for (int ATK : fieldList2.getATK()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateATK2", new ATK(atkid, ATK));
        System.out.println(atkret);
        atkid++;
      }
      for (String TYPE : fieldList2.getTYPE()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateTYPE2", new TYPE(typeid, TYPE));
        System.out.println(typeret);
        typeid++;
      }
      for (int fly : fieldList2.getFly()) {
        int flyret = session.update("igakilab.mybatis.CardMapper.updateFly2", new Fly(flyid, fly));
        System.out.println(flyret);
        flyid++;
      }
      for (int phs : fieldList2.getPhs()) {
        int phsret = session.update("igakilab.mybatis.CardMapper.updatePhs2", new Phs(phsid, phs));
        System.out.println(phsret);
        phsid++;
      }
      for (int mag : fieldList2.getMag()) {
        int magret = session.update("igakilab.mybatis.CardMapper.updateMag2", new Mag(magid, mag));
        System.out.println(magret);
        magid++;
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
