var $$ = $$ || {}
$$ = {
		div : x =>{
			return $('<div id='+x.id +'/>');
		},
		a : x => {
			return $('<a href="'+x.url+'" id='+x.id+'/>');
		},
		li : x=>{
			return $('<li id ='+x.id+'/>');
		},
		h : x=>{
			return $('<h'+x.num+' id='+x.id+'/>');
		}
}