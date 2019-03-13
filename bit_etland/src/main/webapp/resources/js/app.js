var app = app || {};

app.path = (()=>{
	var init = x =>{
		app.session.init(x);
		alert(app.$.ctx());
		onCreate();
	};
	var onCreate = () =>{
		setContentView();
	};
	var setContentView = ()=>{
		
	};
	return {
		init : init
		};
})();

app.session = (()=> {
	var init = x =>{
		onCreate(x);
	};
	var onCreate = () =>{
		sessionStorage.setItem('ctx',x);
		sessionStorage.setItem('js', x +'/resources/js')
		sessionStorage.setItem('img', x +'/resources/img')
		sessionStorage.setItem('css', x +'/resources/css')
	};
	var getPath = () =>{
		return sessionStorage.getItem('ctx');
	};
	
	return {init : init, 
			getPath:getPath
		};
})();

app.$ = {	ctx : ()=> {return sessionStorage.getItem('ctx')},
			js : ()=> {return sessionStorage.getItem('js')},
			img : ()=> {return sessionStorage.getItem('img')},
			css : ()=> {return sessionStorage.getItem('css')}
		};
