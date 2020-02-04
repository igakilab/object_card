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
        System.out.println(f.getEndcheck());
        System.out.println(f.getResult());
        System.out.println(f.getHp());
        System.out.println(f.getAtk());
        System.out.println(f.getType());
        System.out.println(f.getFly());
        System.out.println(f.getPhs());
        System.out.println(f.getMag());
        System.out.println(f.getName());
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
        System.out.println(f.getEndcheck2());
        System.out.println(f.getResult2());
        System.out.println(f.getHp());
        System.out.println(f.getAtk());
        System.out.println(f.getType());
        System.out.println(f.getFly());
        System.out.println(f.getPhs());
        System.out.println(f.getMag());
        System.out.println(f.getName());
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
      int endcheck = fieldList.getEndcheck();
      int result = fieldList.getResult();
      int hpid = fieldList.getId(), atkid = fieldList.getId(), typeid = fieldList.getId();
      int flyid = fieldList.getId(), phsid = fieldList.getId(), magid = fieldList.getId();
      int nameid = fieldList.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateField", new Card(player, endcheck, result));
      System.out.println(ret);

      for (int hp : fieldList.getHp()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHp", new Hp(hpid, hp));
        System.out.println(hpret);
        hpid++;
      }
      for (int atk : fieldList.getAtk()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateAtk", new Atk(atkid, atk));
        System.out.println(atkret);
        atkid++;
      }
      for (String type : fieldList.getType()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateType", new Type(typeid, type));
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
      for (String name : fieldList.getName()) {
        int nameret = session.update("igakilab.mybatis.CardMapper.updateName", new Name(nameid, name));
        System.out.println(nameret);
        nameid++;
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
      int endcheck2 = fieldList2.getEndcheck2();
      int result2 = fieldList2.getResult2();
      int hpid = fieldList2.getId(), atkid = fieldList2.getId(), typeid = fieldList2.getId();
      int flyid = fieldList2.getId(), phsid = fieldList2.getId(), magid = fieldList2.getId();
      int nameid = fieldList2.getId();

      int ret = session.update("igakilab.mybatis.CardMapper.updateField2", new Card2(player, endcheck2, result2));
      System.out.println(ret);

      for (int hp : fieldList2.getHp()) {
        int hpret = session.update("igakilab.mybatis.CardMapper.updateHp2", new Hp(hpid, hp));
        System.out.println(hpret);
        hpid++;
      }
      for (int atk : fieldList2.getAtk()) {
        int atkret = session.update("igakilab.mybatis.CardMapper.updateAtk2", new Atk(atkid, atk));
        System.out.println(atkret);
        atkid++;
      }
      for (String type : fieldList2.getType()) {
        int typeret = session.update("igakilab.mybatis.CardMapper.updateType2", new Type(typeid, type));
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
      for (String name : fieldList2.getName()) {
        int nameret = session.update("igakilab.mybatis.CardMapper.updateName2", new Name(nameid, name));
        System.out.println(nameret);
        nameid++;
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
      int endcheck = resetList.getEndcheck();
      int result = resetList.getResult();

      int ret = session.update("igakilab.mybatis.CardMapper.resetResult", new Card(player, endcheck, result));
      System.out.println(ret);
      session.commit();
    }
  }

  public void resetResult2(Hand2 resetList2) {
    try (SqlSession session = factory.openSession()) {
      String player = resetList2.getPlayer();
      int endcheck2 = resetList2.getEndcheck2();
      int result2 = resetList2.getResult2();

      int ret = session.update("igakilab.mybatis.CardMapper.resetResult2", new Card2(player, endcheck2, result2));
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
