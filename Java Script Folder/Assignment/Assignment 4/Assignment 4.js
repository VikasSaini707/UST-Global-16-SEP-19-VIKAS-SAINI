const items=[
    {
        name:'ear ring',id:1,price:5000
    },
    {
        name:'kajal',id:2,price:200
    },
    {
        name:'trimmer',id:3,price:2000
    },
    {
        name:'Beardo',id:4,price:170
    }
]

//adding 300 to price by using map method
const newPrice=items.map(function(value,price)
{
    value.price=value.price+300;
    return value;
});
console.log(newPrice)
console.log(items);

//printing prices greater than 1000 using filter method
const bigPrice=items.filter(value=>value.price>1000)
console.log(bigPrice)
