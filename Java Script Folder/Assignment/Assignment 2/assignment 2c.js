// circumference of circle
console.log('=====Circumference of circle======')
function circ(rad)
{
    var val=2*3.14*rad;
    return val;
}
var circum=circ(4)
console.log('Circumference is ',circum)

var circ=function(rad)
{
    var val=2*3.14*rad;
    return val;
}
var circum=circ(6)
console.log('Circumference is ',circum);

(function (rad)
{
    var val=2*3.14*rad;
    console.log('Circumference is ',val)
})(8)

var circ=(rad)=>
{
    var val=2*3.14*rad;
    return val;
}
var circum=circ(10)
console.log('Circumference is ',circum)
