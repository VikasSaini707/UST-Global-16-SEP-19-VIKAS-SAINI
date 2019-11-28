console.log('=====Array element addition======')
    function array()
    {
        var sum=0;
        var ar=[1,2,3,4,5]
        for(i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
    var sum=array()
    console.log('The sum of elements is ',sum)

    var value=function()
    {
        var sum=0;
        var ar=[6,7,8,9]
        for(i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
    var sum=value()
    console.log('The sum of elements is ',sum);

    (function()
    {
        var sum=0;
        var ar=[10,20,30,40,50]
        for(i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        console.log('The sum of elements is ',sum)
    })()
    
    var value=()=>
    {
        var sum=0;
        var ar=[60,70,80,90]
        for(i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
    var sum=value()
    console.log('The sum of elements is ',sum);
   