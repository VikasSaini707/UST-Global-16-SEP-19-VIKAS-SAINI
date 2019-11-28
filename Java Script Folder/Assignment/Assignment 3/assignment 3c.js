var names=['vini','murli','aman'];
var id=[7,14,22];
var place=new Array('sain Majra','naraingarh','sabga');
var mobile=['8816832707','8053863122','8295514378'];
var phone=['moto','nokia','realme'];
var height=[5.11,5.6,5.10];
var sirname=['saini','sharma','saini'];
var weight=[74,60,61];
var hobby=['sketching','singing','youtube'];
var dob=['17 aug','18 nov','13 july'];

console.log('=====for in loop======================')
for(var ind in names)
{
    console.log(name[ind]);
}
for(var ind in id)
{
    console.log(id[ind]);
}
for(var ind in place)
{
    console.log(place[ind]);
}
for(var ind in mobile)
{
    console.log(mobile[ind]);
}
for(var ind in phone)
{
    console.log(phone[ind]);
}
for(var ind in height)
{
    console.log(height[ind]);
}
for(var ind in sirname)
{
    console.log(sirname[ind]);
}
for(var ind in weight)
{
    console.log(weight[ind]);
}
for(var ind in hobby)
{
    console.log(hobby[ind]);
}
for(var ind in dob)
{
    console.log(dob[ind]);
}

console.log('======for in loop on objects============')
var person={name:'abhi',age:23}
var fruit={name:'apple',color:'red'}
var car={name:'bmw',milage:20}
var pen={color:'blue',cost:10}
var laptop={name:'dell',processor:'intel'}

for (var key in person) 
{
    console.log(person[key]);
}
for (var key in fruit) 
{
    console.log(fruit[key]);
}
for (var key in car) 
{
    console.log(car[key]);
}
for (var key in pen) 
{
    console.log(pen[key]);
}
for (var key in laptop) 
{
    console.log(laptop[key]);
}