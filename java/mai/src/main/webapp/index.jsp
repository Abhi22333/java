<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="form">
<pre>
Name<input type="text" id="name" name="fullname" onblur="onPressname(event)">
Address<input type="text" id="address" onchange="onPressEmail()">
Age<input type="text" id="age" onchange="onPressage()">
Qualification<select id="qualification" onchange="onPressQualification()">

<option>select</option>
<option>BE</option>
<option>Mtech</option>
</select>
Percentage<input type="text" id="per" onchange="onpressPercentage()">
college<input type="text" id="college" onkeypress="onpresscollege()">
<input type="submit" value="submit">

</pre>
</form>

<h3 id="show1"></h3>
<h3 id="show2"></h3>
<h3 id="show3"></h3>
<h3 id="show4"></h3>
<h3 id="show5"></h3>
<h3 id="show6"></h3>
<script type="text/javascript">

let onPressname=(event)=>{
	
	//let getName=document.getElementById("name");
	//document.getElementById("show1").innerHTML=getName.value;
	const {name,value}=event.target;
	console.log(value);
	console.log(name);
	if(name==="fullname" && name.length>3){
		console.log("valid");
		document.getElementById("show1").innerHTML="valid";
	}
	else{
		console.log(error);
		document.getElementById("show1").innerHTML="invalid";
		
	}
	}
</script>


</body>
</html>