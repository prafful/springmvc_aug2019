console.log("Hello from JS in Spring MVC")
console.log("I am from JS!!!!")

function meIsFunction(){
	console.log("I am from function in JS! check email")
}

meIsFunction()

function checkEmail(){
	console.log("Validate email!")
	var form = document.getElementById("myform")
	var emailErrorSpan = document.getElementById("emailerror")
	
	console.log(form)
	var email = form["email"].value
	console.log(email)
	//var emailRegularExpression = "/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/"
		
	if(email == null || email=="" ){
		
		console.log(emailErrorSpan)
		emailErrorSpan.innerHTML = "Email cannot be blank!"
	}	
	
//	if(!email.match(emailRegularExpression)){
//		emailErrorSpan.innerHTML = "Invalid Email!"
//	}
}

