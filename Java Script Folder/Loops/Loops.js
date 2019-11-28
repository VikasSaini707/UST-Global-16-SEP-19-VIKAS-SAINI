var brand=['kingfisher','bisleri','aquafina','kinley'];
//for of loop
console.log('======For of LOOP===========')
for(var element of brand) 
{
    console.log(element);
}

console.log('=====For in loop=================')
for (var index in brand) {
    
    console.log(brand[index]);
}

var person={
    name:'sundri',
    age:33,
    color:'white'
}
console.log('=======For in loop for objects===============')
for (var index in person) {
    
    console.log(person[index]);
}

console.log('=======For Each loop===============')
var movies=['sholay','titanic','jurassic park','mayabazar']
movies.forEach(function(val,ind)
{
    console.log(val);
})

console.log('=======For Each loop on Object===============')
var items=[{
                item:'shoes',id:1,price:1000
            },
            {
                item:'eyeliner',id:2,price:100
            },
            {
                item:'watch',id:3,price:5000
            },
            {
                item:'Bike',id:4,price:1000000
            }
];

items.forEach(function(val,ind)
{
    console.log(val);
})




















