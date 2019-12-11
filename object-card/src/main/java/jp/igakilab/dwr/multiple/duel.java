package jp.igakilab.dwr.multiple;
import java.util.ArrayList;

public class duel{
  public void p1_status(final int j) {
    String str = "" + field_card[j];
    p1_card.COST = Number(str.slice(4, 5));
    if (str.slice(4, 5) == 'c') {
      p1_card.ATK = 1;
    } else if (str.slice(4, 5) == 'd') {
      p1_card.ATK = 2;
    } else if (str.slice(4, 5) == 's') {
      p1_card.ATK = 3;
    } else if (str.slice(4, 5) == 'h') {
      p1_card.ATK = 4;
    }
    p1_card.HP = Number(str.slice(6, 7));
    console.log("p1_card.HP:" + p1_card.HP + " ATK:" + p1_card.ATK);
  }

  public void p1_status_update(final int j, final int k) {
    String str = "" + field_card[j];
    field_card[j] = str.slice(0, 5) + k;
  }

  public void p2_status_update(final int j, final int k) {
    String str1 = "" + p2_field_card[j];
    p2_field_card[j] = str1.slice(0, 5) + k;
  }

  public void p2_status(final int j) {
    String str1 = "" + p2_field_card[j];
    p2_card.COST = Number(str1.slice(4, 5));
    if (str1.slice(4, 5) == 'c') {
      p2_card.ATK = 1;
    } else if (str1.slice(4, 5) == 'd') {
      p2_card.ATK = 2;
    } else if (str1.slice(4, 5) == 's') {
      p2_card.ATK = 3;
    } else if (str1.slice(4, 5) == 'h') {
      p2_card.ATK = 4;
    }
    p2_card.HP = Number(str1.slice(6, 7));
  }

  public void p2_status_win(final int j) {
    String str1 = "" + p2_field_card[j];
    p2_card.COST = Number(str1.slice(4, 5));
    p2_card.HP = Number(1);
    p2_card.ATK = 1;
  }

  public static void result(final int c1, final int c2) {
    if (count2 == 4) {
      if (wins >= 1) {
        wins++;
        WINText.setText("WINS:" + wins);
      } else {
        wins = 1;
        WINText.setText("WIN");
      }
    } else if (count1 == 4) {
      WINText.setText("LOSE");
      HP -= 1;
    }
    HPText.setText("HP" + HP);
    count1 = 0;
    count2 = 0;
  }

  public int duel_result(final string[] a, final string[] b) {
    return 1;
  }



  public static void main(String[] args) {
    static class p1_card {
      static int COST = 0;
      static int HP = 0;
      static int ATK = 0;
    }
  
    static class p2_card {
      static int COST = 0;
      static int HP = 0;
      static int ATK = 0;
    }
  
    String field_card[] = { "cardc01", "cardc02", "cardc03", "cardc04", "cardc05" };
    String p2_field_card[] = { "cardd01", "cardd02", "cardd03", "cardd04", "cardd05" };
    int count1 = 0;// p1
    int count2 = 0;// p2

    int i = 0;
    while (count1 != 4 && count2 != 4) {
      i++;
      if (field_card[i] != null) {
        
        atack = 0;
        final int rndm = Math.floor(Math.random() * 4 + 1);

        if (p2_field_card[rndm] != null) {
          p1_status(f, i);
          p2_status(p2_f, rndm);
          console.log("p1_card.HP:" + p1_card.HP + " ATK:" + p1_card.ATK + " VS " + "p2_card.HP:" + p2_card.HP + " ATK:"+ p2_card.ATK);

          p1_card.HP = p1_card.HP - p2_card.ATK;
          if (p1_card.HP <= 0) {
            field_card[i] = null;
            count1++;// カードが倒された
          } else {
            p1_status_update(f, i, p1_card.HP);
          }
          console.log(p1_card.HP + "-" + p2_card.ATK + " :" + rndm);
          p2_card.HP = p2_card.HP - p1_card.ATK;
          if (p2_card.HP <= 0) {
            p2_field_card[rndm] = null;
            count2++;// カードが倒された
          } else {
            p2_status_update(p2_f, rndm, p2_card.HP);
          }
          // field_cardの中にある文字列をＨＰの残量で書き換える
          // console.log('afsum field_card:'+field_card[i]);

          // ここでatack_playerの数字を変更する DBと更新
        }
      } // 攻め側の1ターン この後相手の攻めの1ターンがいる
        // ここでDBと更新して相手にターンを渡せるといい

      console.log("count1:" + count1);
      //System.out.println(count1);
      console.log("count2:" + count2);
      if (i == 5) {
        i = 0;
      }
      }
      result(count1, count2);
      console.log(count1,count2);
      if(p_turn==1){
        p_turn=0;//
      }else{
        p_turn=1;//
      }//攻守交替最初に殴るのがどっちか
        
    }//p1からp2への戦い一方的
}
