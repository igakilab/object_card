
/*!

 * <form>�I�u�W�F�N�g����JSON�I�u�W�F�N�g�ւ̃V���A���C�Y�g���D

 * <form>���̑S�Ă�<input>�I�u�W�F�N�g���ꂼ��ɑ΂��āCname ������t�^���邱�ƁD

 * 

 * shinsuke-m

 * 

 */

$.fn.extend({

	serializeJson:function() {

		var json = new Object;

		

		// �S�q�v�f�𑖍�

		$(this).children().each(function(){

			

			// �ċA�Ăяo���ɂ��S�q���v�f�̒T��

			$(json).attr($(this).serializeJson());

			

			var tag = $(this).get(0).tagName;

			// <input> �� <select> �� <textarea> ��T��

			if (tag.match(/^input/i) || tag.match(/^select/i) || tag.match(/^textarea/i)) {



				var type = $(this).attr('type')

				if (type != undefined && type.match(/^button/i)) {

					return; // type=button�͖���

				}

				var name = $(this).attr('name');

				if(name == undefined || name == '') {

					console.error('[JSON�V���A���C�Y�x��] type=' + type

							+ '�̓��̓t�H�[���ɂ�name�������t�^����Ă��܂���D�V���A���C�Y�𖳎����܂��D');

					return;

				}

				

				if ($(json).attr(name) != undefined) {

					console.error('[JSON�V���A���C�Y�x��] name=' + name

							+ '�̓��̓t�H�[����name�������d�����Ă��܂��D�V���A���C�Y�𖳎����܂��D');

					return;

				}

				$(json).attr(name, $(this).val());

			}

		});

		return json;

	}

})