# Object Card
色を塗りながらプログラミングが学べるゲーム

このプロダクトでは，プログラミング的思考を育成しながら，ソフトウェア開発の要素であるプログラム理解を，ゲームを通して自然に学ぶことができる．\
ここでのプログラム理解とは，ソースコードから処理過程や実行結果を把握することである．\
以下に，セットアップマニュアルを記す．


## 準備
### PostgreSQLのインストール
* このゲームに使用したデータベースは，PostgreSQL v9.6.1である．以下のURLから「PostgreSQLPortable_9.6.1.zip」をダウンロードし，任意の場所に解凍する．
    * <https://github.com/garethflowers/postgresql-portable/releases/tag/v9.6.1>

* 解凍が完了したら，ゲームをプレイするのに必要なテーブルの作成を行う．解凍したフォルダを開き，「PostgreSQLPortable.exe」をダブルクリックしてPostgreSQLを起動させる．起動が完了したら，以下のSQL文を順番に入力する．

```sql
create database object_card; --coloring_with_programmingという名前のDBを作成する．
\c object_card --object_cardというDBにアクセスする．\dを入力すると，DB内のテーブルを一覧表示する．\d {テーブル名}を入力すると，指定したテーブルの属性を一覧表示する．
create table field(id int, player varchar(7), end_check int, result int, hp int, atk int, type varchar(7), fly int, phs int, mag int, name varchar(32));
create table field2(id int, player varchar(7), end_check2 int, result2 int, hp int, atk int, type varchar(7), fly int, phs int, mag int, name varchar(32));
creatre table player(player varchar(8), plyhp int, result int);
creatre table player(logid int, log varchar(64));
insert into field (id) values (1);
insert into field (id) values (2);
insert into field (id) values (3);
insert into field2 (id) values (1);
insert into field2 (id) values (2);
insert into field2 (id) values (3);
insert into log (logid) values (1);
insert into log (logid) values (2);
insert into log (logid) values (3);
insert into log (logid) values (4);
insert into log (logid) values (5);
insert into log (logid) values (6);
```

### Tomcat 8のインストール
* このゲームに使用したアプリケーションサーバーは，Tomcat 8である．Windowsの「設定->システム->バージョン情報」から使用しているPCのシステムの種類を確認し，以下のURLの「32-bit Windows.zip」と「64-bit Windows.zip」の適切な方をダウンロードする．ダウンロード完了後，任意の場所に解凍する．
    * <https://tomcat.apache.org/download-80.cgi>

### JDKのインストールとWindowsの環境変数設定
* Tomcatを動作させるために，JDKをインストールする．以下のURLよりJDKとJREを任意の場所にダウンロードする．ビット数は，先ほどバージョン情報で確認したビット数である．ダウンロード完了後，C:\Program Files下に解凍する．
    * <https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html>

* 続いて，Windowsの環境変数設定を行う．Windowsの「コントロールパネル->システムとセキュリティ->システム->システムの詳細設定->環境変数」を開く．
* 環境変数でユーザ/システム環境変数のどちらかに，\
    変数名：JAVA_HOME，変数値：(JDKのbinがあるフォルダの一つ上のパス)を指定する.\
    変数名：JRE_HOME, 変数値：(JREのbinがあるフォルダの一つ上のパス)を指定する．

* 上記の方法で分からなかった場合は，以下を参考にしていただきたい．
       * <https://weblabo.oscasierra.net/java-installing-oracle-jdk8/>

### Chromeのインストール
* このゲームは，Chromeのみ動作が確認されているため，使用しているPCにChromeがインストールされていない場合は，Chromeを以下のURLからインストールする必要がある．
    * <https://www.google.com/intl/ja_ALL/chrome/>


## 導入方法
* このリポジトリをgitcloneし，zipファイルを任意の場所に解凍する．
* 解凍したフォルダを開き，destフォルダ内の「object_card.war」をtomcatのwebappsフォルダ内に置く．
* PostgreSQLを解凍したフォルダを開き，「PostgreSQLPortable.exe」をダブルクリックしてPostgreSQLを起動する．
* Tomcatのbinフォルダにある「startup.bat」をダブルクリックして，Tomcatを起動させる．
* Tomcatが正常に起動したのを確認後，Chromeを起動して以下のURLにアクセスし，ログインページが表示されれば導入成功である．
    * <http://localhost:8080/object-card/login.html>


## 遊び方
### ゲームのページへのアクセス方法
1. PostgreSQLを解凍したフォルダを開き，「PostgreSQLPortable.exe」をダブルクリックしてPostgreSQLを起動する．
1. Tomcatのbinフォルダにある「startup.bat」をダブルクリックして，Tomcatを起動させる．
1. ゲームを導入したPCでコマンドプロンプトを開き，ipconfigと入力し，「IPv4 アドレス」の欄に出てきたIPアドレスをコピーする．
1. 対戦を行いたいPC2台に向けて，何らかの方法(Slack，LINEなど)で以下のURLを通知する．なお，ゲームを導入したPCで対戦を行う場合は，対戦相手に向けて通知するだけでよい．
    * <http://(コピーしたIPアドレス):8080/object-card/login.html>
1. 両方のPCでChromeから上記のURLにアクセスし，ログインページが表示されれば成功である．

### ログインとルーム設定
1. ログインページからp1かp2それぞれ選択した後，STARTボタンを押す．
1. もう片方のプレイヤーも同様に行う．
1. 両方のプレイヤーにゲーム画面が表示されれば成功である．

### ゲームの進め方
1. 自分のフェーズが開始されると，初めの盤面の状態が表示される．\
1. 盤面中央のカードをクリックすると盤面のSETにカードのIDが表示される．
1. 盤面下部の自分の手札をクリックすると，SETに表示されたキャラクターに対してカードを使用する．
1. 初めに継承カード枚が各プレイヤーに配られ，それぞれ場札に使用する(キャラクターに継承していないとあとで山札から引いたオーバーロード，オーバーライド，カプセル化のカードを使えない)．
1. 山札をクリックして手札を補充する（1ターンに5枚までドローできることとする）．
1. オーバーロード，オーバーライド，カプセル化カードを使ってカードの下部にある二つの数字（攻撃力と体力）を足していく．
    - オーバーロードカード\
        カードに魔法属性，物理属性，飛行属性を追加できる．
    - オーバーライドカード\
        各属性があれば（魔法使いの絵が描いてあれば魔法の属性）大幅な強化が得られる．
    - カプセル化カード\
        カードに追加された属性を選択して削除でき，強化される数値が大きい．カプセル化カードを使うとint attackの左に＋マークが表示されるので削除したい属性をクリックすると削除できる．
1. 強化が終わるとインスタンスをクリックして自分の参加させたいキャラクターを3体選びENDボタンをクリックすると相手がENDボタンを押すまで待機．
1. 自動で対戦が行われ，自分のキャラクターが全滅するとHPが1減る．
1. 対戦ログを見るをクリックして対戦の結果を見る(画面上部の相手の場札をクリックすることで相手カードの情報が表示される)．
1. 山札をクリックしてドローするところから繰り返し，どちらか一方のHPが0になるまで行う．
