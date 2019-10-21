var total = 6;  //�J�[�h�̖���
var speed = 150;  //�J�[�h���߂��鑬�x
var returnSec = 1000;  //�߂������J�[�h�����ɖ߂�b��
var cat = [];  //�e�J�[�h�̔ԍ����i�[����z��
var index;  //�N���b�N�����J�[�h�̕��я�
var first = true;  //�N���b�N�����J�[�h��1���ڂ��ǂ����̔���p
var card1;  //1���ڂɈ������J�[�h�̔ԍ�
var card2;  //2���ڂɈ������J�[�h�̔ԍ�
var pair = 0;  //���������J�[�h�̃y�A��


//�J�[�h�����
function cardClose(i,n){
  $("#card li:eq("+i+")").stop().animate({ left: "75"}, speed);
  $("#card li:eq("+i+") img").stop().animate({ width: "0",height: "200px"}, speed,
  function(){
    n(i);
  });
}
//�\�ʂ��J��
function omoteOpen(){
  $("#card li:eq("+index+") img").attr("src","img/card"+cat[index]+".png");
  $("#card li:eq("+index+") img").stop().animate({ width: "150px",height: "200px"}, speed);
  $("#card li:eq("+index+")").stop().animate({ left: "0"}, speed);
}
//���ʂ��J��
function uraOpen(j){
  $("#card li:eq("+j+") img").attr("src","img/card.png");
  $("#card li:eq("+j+") img").stop().animate({ width: "150px",height: "200px"}, speed);
  $("#card li:eq("+j+")").stop().animate({ left: "0"}, speed);
}

//�N���b�N�ł��Ȃ��悤�ɃJ�[�h�����b�N
function cardlock(){
  $("#card li:eq("+index+")").addClass("lock");
}
//�S�ẴJ�[�h�����b�N
function alllock(){
  $("#card li").addClass("lock");
}
//�S�ẴJ�[�h���A�����b�N
function unlock(){
  $("#card li").removeClass("lock");
}

//�I��2���̃J�[�h�̐���
function comparison() {
  if(card1==card2){  //2���������J�[�h�ł����
    $("#card li:eq("+index+")").addClass("off");  //2���ڂ̃J�[�h�̃N���b�N����𖳌���
    $("#card li:eq("+index1+")").addClass("off");  //1���ڂ̃J�[�h�̃N���b�N����𖳌���
    pair++;  //�y�A����1���₷
    if(pair==total/2){  //�y�A���S�Č���������
      setTimeout(function(){  //�Ō�̃J�[�h���߂���ꂽ��ɃN���A�[�\��
        alert("�N���A�[�I")
      }, returnSec);
    }
  } else {  //2�����Ⴄ�J�[�h�ł����
    setTimeout(function(){  //returnSec�~���b��i�J�[�h���߂��铮�삪�I�������j��
        cardClose(index,uraOpen);  //2���ڂ̃J�[�h�𗠖ʂɖ߂�
        cardClose(index1,uraOpen);  //1���ڂ̃J�[�h�𗠖ʂɖ߂�
    }, returnSec);
  }
  first = true;  //1���ڂ��ǂ����̔����L����
  card2 = 0;  //2���ڂ̃J�[�h�̕��я������Z�b�g
  setTimeout(function(){
    unlock();  //�S�ẴJ�[�h��.lock���폜
  }, returnSec+speed*2);
}

$(function(){
  //�J�[�h�̔ԍ���z��Ɋi�[
  for(i=1; i<=total/2; i++) {
    cat.push(i,i);
  }
  //�z��̒��g�������_���ɕ��ёւ�
  cat.sort(function() {
    return Math.random() - Math.random();
  });
  //�J�[�h�摜�̓�����li�^�O�̐���
  for(i=1; i<=total; i++) {
    $("#card").append("<li><img src='img/card.png'></li>");
  }

  $("#card li").click(function(){
    index = $("#card li").index(this);  //�I�������J�[�h�̏��Ԃ�index�ɕۑ�
    cardlock();  //�I�������J�[�h�̃N���b�N�𖳌��ɂ���֐�
    cardClose(index,omoteOpen);  //�J�[�h����A�\�ʂ��J���֐�

    if(first == true){  //�I�������J�[�h��1���ڂł����
      index1 = index;  //�J�[�h�̏��Ԃ�index1�ɕۑ�
      card1= cat[index];  //���я�����ɕ\�ʂ̔ԍ���z�񂩂���o��card1�ɕۑ�
      first = false;  //1���ڂ��ǂ����̔���𖳌���

    } else {  //�I�������J�[�h��2���ڂł����
      alllock();  //�S�ẴJ�[�h�̃N���b�N�𖳌��ɂ���֐�
      card2 = cat[index];  //���я�����ɕ\�ʂ̔ԍ���z�񂩂���o��card2�ɕۑ�
      comparison();  //card1��card2���ׂĐ��ۂ̔��������֐�
    }
  });

});