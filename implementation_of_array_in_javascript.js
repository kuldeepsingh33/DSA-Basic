<!DOCTYPE html>
<html>

<head>
	<title>
		Implementation of array
	</title>
</head>

<body>
	<script>
		class Array{
	constructor(){
		this.length=0;
		this.data={};
	}
	getElementAtIndex(index){
		return this.data[index];
	}
	push(element){
		this.data[this.length]=element;
		this.length++;
		return this.length;
	}
	pop(){
		const item= this.data[this.length-1];
		delete this.data[this.length-1];
		this.length--;
		return this.data;
	}
	deleteAt(index){
		for(let i=index; i<this.length-1;i++){
		this.data[i]=this.data[i+1];
		}
		delete this.data[this.length-1];
		this.length--;
		return this.data;
	}
	insertAt(item, index){
		for(let i=this.length;i>=index;i--){
		this.data[i]=this.data[i-1];
		}
		this.data[index]=item;
		this.length++;
		return this.data;
	}
	}
	const array= new Array(); //we are instantiating an object of Array class
	array.push(12);
	array.push(13); //pushing element
	array.push(14);
	array.push(10);
	array.push(989);
	document.write("<div>Print element in an array</div>");
	for(var key in array.data){
	document.write("<span>"+array.data[key]+" "+"</span>");
	}
	
	
	document.write("<div>Pop element in an array</div>");
	array.pop(); //Popping element 989
	for(var key in array.data){
	document.write("<span>"+array.data[key]+" "+"</span>");
	}
	
	
	document.write("<div>Inserting element at position 2</div>");
	array.insertAt(456, 2); //Inserting element 456
	for(var key in array.data){
	document.write("<span>"+array.data[key]+" "+"</span>");
	}
	
	document.write("<div>deleting element at position 3</div>");
	array.deleteAt(3); //Deleting 14
	for(var key in array.data){
	document.write("<span>"+array.data[key]+" "+"</span>");
	}
	
	document.write("<div>Getting element at position 2</div>");
	document.write("<div>"+array.getElementAtIndex(2)+"</div>");
	</script>
</body>
</html>					
