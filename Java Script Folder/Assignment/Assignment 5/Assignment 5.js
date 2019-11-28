var names=['vini','murli','aman'];
var id=[7,14,22];
var place=new Array('sain Majra','naraingarh','sabga');
var mobile=['8816832707','8053863122','8295514378'];
var phone=['moto','nokia','realme'];

console.log('======isArray============')
const arr=Array.isArray(names);
console.log(arr);
const arr1=Array.isArray(id);
console.log(arr1);
const arr2=Array.isArray(place);
console.log(arr2);
const arr3=Array.isArray(mobile);
console.log(arr3);
const arr4=Array.isArray(phone);
console.log(arr4);

console.log('======includes ============')
const ar=names.includes('murli')
console.log(ar);
const ar1=id.includes(7)
console.log(ar1);
const ar2=place.includes('sabga')
console.log(ar2);
const ar3=mobile.includes('8816832707')
console.log(ar3);
const ar4=phone.includes('noki')
console.log(ar4);

console.log('=====push========')
names.push('kunal','geetika');
console.log(names);
id.push(8,24);
console.log(id)
place.push('ambala');
console.log(place);
mobile.push('9876543210')
console.log(mobile)
phone.push('redmi','oppo')
console.log(phone)

console.log('=====pop============')
names.pop();
console.log(names);
id.pop();
console.log(id)
place.pop();
console.log(place);
mobile.pop()
console.log(mobile)
phone.pop()
console.log(phone)

console.log('=======unshift==========')
names.unshift('geetika')
console.log(names);
id.unshift(8,24);
console.log(id)
place.unshift('ambala');
console.log(place);
mobile.unshift('9876543210')
console.log(mobile)
phone.unshift('redmi','oppo')
console.log(phone)

console.log('========shift==========')
names.shift();
console.log(names);
id.shift();
console.log(id)
place.shift();
console.log(place);
mobile.shift()
console.log(mobile)
phone.shift()
console.log(phone)

console.log('========splice==========')
names.splice(1,2,'rahul','kapil');
console.log(names)
id.splice(1,2,18,19);
console.log(id)
place.splice(2,0,'cantt','delhi');
console.log(place);
mobile.splice(0,0,'123','234','344')
console.log(mobile)
phone.splice(0,1,'apple','vivo')
console.log(phone)

console.log('==========slice==========')
var a1=names.slice(2,4);
console.log(a1)
var a2=id.slice(2,4);
console.log(a2)
var a3=place.slice(2,4);
console.log(a3)
var a4=mobile.slice(2,4);
console.log(a4)
var a5=phone.slice(2,4);
console.log(a5)

console.log('=======join============')

console.log(names.join('=='))
console.log(id.join('++'))
console.log(place.join('--'))
console.log(mobile.join('::'))
console.log(phone.join('//'))

console.log('========indexOf===========')
const i1=names.indexOf('murli');
console.log(i1);
const i2=id.indexOf(7);
console.log(i2);
const i3=phone.indexOf('redmi',2);
console.log(i3);
const i5=place.indexOf('sabga',1);
console.log(i5);
const i4=mobile.indexOf('8816832707');
console.log(i4);

console.log('========map function===========')
const n1=names.map(value=>value+'**');
console.log(n1)
const n2=id.map(value=>value+100);
console.log(n2)
const n3=place.map(value=>value+'$$');
console.log(n3)
const n4=mobile.map(value=>value+'<>');
console.log(n4)
const n5=phone.map(value=>value+'()');
console.log(n5)

console.log('=========filter function===========')
const n11=names.filter(value=>value!=='rahul');
console.log(n11)
const n21=id.filter(value=>value>20);
console.log(n21)
const n31=place.filter(value=>value==='sain Majra');
console.log(n31)
const n41=mobile.filter(value=>value!=='8816832707');
console.log(n41)
const n51=phone.filter(value=>value==='nokia');
console.log(n51)







