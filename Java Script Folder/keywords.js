
//var keryord//
var name;
var name='sahoo';
name='kesri';
console.log(name)

//let keyword

let name1;
//  let name1='titanic';  error due to no redeclartion
name1='hello';
name1='hii'  //re initialization possible
console.log(name1);

//const keyword

//const name2; only declaration not possible,we have to initialize also
const name2='good';
//name2='bibi';   no reinitialization 
console.log(name2);


console.log('=======================================')
for(var i=0;i<5;i++)
{
    console.log(i);
}
console.log('outer',i); // in case of var we can use variable at anywhere because it is hoisted
//but in case of let and const we get an error


console.log('=================================')
var x;
console.log(x)
x=10;