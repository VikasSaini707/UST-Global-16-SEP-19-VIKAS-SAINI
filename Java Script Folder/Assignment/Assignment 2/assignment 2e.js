console.log('=====Prime Number======')

function prime(num)
{
    if(num==1||num==0)
    {
        return num+' is Not Prime Number';
    }
    var a=2;
    while(a<=num/2)
    {
        if(num%2==0)
        {
            return num+' is Not Prime Number';
        }
        a++;
    }
    return num+' is Prime Number';
}
var res=prime(2);
console.log(res)

var prime=function(num)
{
    if(num==1||num==0)
    {
        return num+' is Not Prime Number';
    }
    var a=2;
    while(a<=num/2)
    {
        if(num%2==0)
        {
            return num+' is Not Prime Number';
        }
        a++;
    }
    return num+' is Prime Number';
}
var res=prime(4);
console.log(res)

var prime=num=>
{
    if(num==1||num==0)
    {
        return num+' is Not Prime Number';
    }
    var a=2;
    while(a<=num/2)
    {
        if(num%2==0)
        {
            return num+' is Not Prime Number';
        }
        a++;
    }
    return num+' is Prime Number';
}
var res=prime(7);
console.log(res)
