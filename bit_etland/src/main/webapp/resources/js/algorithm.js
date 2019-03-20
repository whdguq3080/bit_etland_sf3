var algorithm = algorithm || {};

algorithm = (()=>{
	let init = x => {
		algorithm.$.init(x);
	};	
	let onCreate = () => {
		setContentView();
	};	
	let setContentView = () => {
		$.getScript($.js()+'/component.js',()=>{
			nav();
			remove();
			question('등차수열의 합계');
			$('#right_content').prepend($$.div({id:'right_start'}));
			$('#leave_a_comment').before('<div id="right_end"/>');
			$('#right_start').nextUntil('#right_end')
				.wrapAll('<div id="new_div"></div>');
			var str = $('#new_div').html();
			$('#new_div').remove();
			$('#right_end').remove();
			let arr= [
				{id:'a',val:'등차수열의 합계'},
				{id:'b',val:'등비수열의 합계'},
				{id:'c',val:'팩토리얼수열의 합계'},
				{id:'d',val:'피보나치수열의 합계'},
			];
			$.each(arr,(i,j)=>{
				 $('#right_start').append(str);	
				 $('#que_1').attr('id','question_'+j.id);	
				 $('#question_'+j.id).text(j.val);	
		});
	});
};
let nav = ()=> {	
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
};	
let remove = ()=> {	
	$('#del_start').before('<div id="start"/>');	
	$('#del_end').after('<div id="end"/>');	
	$('#start').nextUntil('#end').wrap().remove();	
};	
let inputForm = ()=> {	
	$('#answer').html($$.label({id:'lab_1'}).text('시작값 :'));
	$('#answer').append($$.input({type:'text',id:'start',name:'start'}));
	$('#answer').append($$.label({id:'lab_2'}).text('end 값:'));
	$('#answer').append($$.input({type:'text',id:'end',name:'end'}));
	$('#answer').append($$.label({id:'lab_3'}).text('공차'));
	$('#answer').append($$.input({type:'text',id:'diff',name:'diff'}));
};	
let question =()=> {
		$('#que_1').text('등차수열의 합계');
		inputForm();
		$('#answer_btn_1').text('result').addClass('cursor').click(()=>{			
		$.ajax({
		url : $.ctx()+'/algo/seq/1',
		type : 'post',
		data :  JSON.stringify(
				{start: $('#start').val(),
					 end: $('#end').val(),
					 diff: $('#diff').val()}),
		datatype : 'json',
		contentType : "application/json",
		success : d=>{
			$('#answer').html($$.h({id:'h_res',num:'2'})
						.text('결과값:' + d.result));
		},
		error : e=>{
			alert('AJAX 실패');
			}
		});
		
	}); 
		$('#answer_btn_2').text('reset').addClass('cursor')
		.click(()=>{
		});		
}; 

return {init:init,
	onCreate:onCreate};

})();
algorithm.$ = {	
			init : (x) => {
				$.getScript(x+'/resources/js/router.js',()=>{
				$.extend(new Session(x));
				algorithm.onCreate();
		})
	}
};

