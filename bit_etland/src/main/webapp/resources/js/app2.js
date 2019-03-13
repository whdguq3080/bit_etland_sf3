var app = app || {};
app.path = (()=>{
	var init = x => {
		onCreate();
	};
	var onCreate = () =>{
		setContextView();
	};
	var setContextView = () =>{
		
	};
	return {init : init};
})();		
app.session = (()=>{
	var init = x => {
		onCreate(x);
	};
	var onCreate = () => {
		sessionStorage.setItem('ctx',x);
	};
	var getPath = () => {
		sessionStorage.getItem('ctx');
	};
	return {init : init , getPath : getPath};
})();
app.$ = {
		ctx : ()=> {return sessionStorage.getItem('ctx')}
	};