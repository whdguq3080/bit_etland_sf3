function sequence(){
	_sequence.nav();
	_sequence.remove();
	_sequence.question('등차수열의 합계');
	$('#right_content').prepend($$.div({id:'right_start'}));
	$('#leave_a_comment').before('<div id="right_end"/>')
	$('#right_start').nextUntil('#right_end')
		.wrapAll('<div id="new_div"></div>');
	let str = $('#new_div').html();
	$('#new_div').remove();
	$('#right_end').remove();
	let arr = [
		{id:'a' ,val:'등차수열의 합계'},
		{id:'b' ,val:'등비수열의 합계'},
		{id:'c' ,val:'팩토리얼수열의 합계'},
		{id:'d' ,val:'피보나치수열의 합계'},
		];
	$.each(arr,(i,j)=>{
		//$('#right_start').append(str);
		$(str).appendTo('#right_start')
		$('#que_1').attr('id','question_'+j.id);
		$('#question_'+j.id).text(j.val);
		$('.buttons').empty();
		
		
		$('<span class ="label label-danger"></span>')
		.text('result')
		.addClass('cursor')
		.appendTo('.buttons')
		.click(()=>{
			let data =
					{start: $('#start').val(),
					 end: $('#end').val(),
					 diff: $('#diff').val()};
			alert('일단 결과 클릭됨 '+ $('#start').val());
			$.ajax({
			url : $.ctx()+'/algo/seq/1',
			type : 'post',
			data : JSON.stringify(data),
			dataType: 'json',
			contentType : "application/json",
			success : d=>{
				alert('넘어온 문제번호 : '+d.result);
				$('#answer').html($$.h({id: 'h_res',num: '2' })
						.text('결과값: '+d.result));
				$('#form').remove();
			},
			error : e=>{
				alert('AJAX 실패');
			}
		});
	});	
	$('<span class="label label-primary" style="margin-left: 5px"></span>')	
	.text('reset')
	.addClass('cursor')
	.appendTo('.buttons')
	.click(()=>{
		_sequence.inputForm();
		});
	}); 
}
var _sequence ={
	inputForm :()=>{
		$('#answer').html($$.label({id:'lab_1'}).text('시작값 :'));
		$('#answer').append($$.input({type:'text',id:'start',name:'start'}));
		$('#answer').append($$.label({id:'lab_2'}).text('end 값:'));
		$('#answer').append($$.input({type:'text',id:'end',name:'end'}));
		$('#answer').append($$.label({id:'lab_3'}).text('공차'));
		$('#answer').append($$.input({type:'text',id:'diff',name:'diff'}));	
	
		},
	question : (x)=> {
			$('#question').text(x);
			_sequence.inputForm();
			$('#reset_btn_1').text('reset').addClass('cursor')
			.click(()=>{			
			_sequence.inputForm();
			}); 
		},
	nav : ()=> {	
		$('#nav').children().eq(0)
		.html($$.a({id:'seq', url:'#'}).text('수열'));
		$('#nav').children().eq(1)
		.html($$.a({id:'math',url:'#'}).text('수학'));
		$('#nav').children().eq(2)
		.html($$.a({id:'sort',url:'#'}).text('배열'));
		$('#nav').children().eq(3)
		.html($$.a({id:'coll',url:'#'}).text('자료구조'));
		$('#nav').append($$.li({id:''})).children().eq(4)
		.html($$.a({id:'app'}).text('응용'));
		$('#que_2').text('등비수열의 합계');	
	
	},
	remove : ()=> {	
		$('#del_start').before('<div id="start"/>');	
		$('#del_end').after('<div id="end"/>');	
		$('#start').nextUntil('#end').remove();	
	}
}; 