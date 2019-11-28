//Named Functions
function add(num1,num2)
{
    console.log('Sum= ',num1+num2);
}
add(12,10);

mul(10,30)
function mul(n1,n2){
    console.log(n1*n2)
}
//functions Expressions

var sub=function(num1,num2)
{
    console.log('Sub= ',num1-num2);
    return num1-num2;
}
var value=sub(20,10)
console.log('Value= ',value)

function add(num1,num2,num3)
{
    console.log('sum= ',num1+num2+num3);
}

//Self invoked functions
console.log('hello');// always write ; before writing self invoke function
(function(num1,num2)
{
    console.log('sum= ',num1+num2)
})(10,20)

//Fat arrow functions

var value=(num1,num2)=>
{
    console.log('sum= ',num1+num2)
}
value(18,67)

var sum=num=>console.log(num)
sum(120);


var div=(num1,num2)=>num1/num2
var value=div(10,2)
console.log(value)