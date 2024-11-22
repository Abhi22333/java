function validation(event) {
	const { name, value } = event.target;
	console.log("name is " + name + "   " + "value is  " + value)

	if (name == "uname" && value.length > 4 && value.trim()) {
		console.log(value + "name is valid");
		a
	} else if (name == "uname" && value.length < 4 && value.trim()) {
		console.log(value + "name is in valid ");
	}

	if (lname == "lname" && value.length > 4 && value.trim()) {
		console.log(value + "lname is valid");

	} else if (lname == "lname" && value.length < 4 && value.trim()) {
		console.log(value + "lname is in valid ");
	}

}