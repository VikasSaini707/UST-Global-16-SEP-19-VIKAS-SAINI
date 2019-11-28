
    //fibonacci series

    console.log('=====Fibonacci Series======');
    function fib(num)
    {
        var f1=0
        var f2=1
        console.log(f1)
        console.log(f2)
        for(i=2;i<num;i++)
        {
            var f3=f1+f2;
            console.log(f3)
            f1=f2
            f2=f3
        }

    }
    fib(4);

    var value=function(num)
    {
        var f1=0
        var f2=1
        console.log(f1)
        console.log(f2)
        for(i=2;i<num;i++)
        {
            var f3=f1+f2;
            console.log(f3)
            f1=f2
            f2=f3
        }

    }
    value(6);

    (function(num)
    {
        var f1=0
        var f2=1
        console.log(f1)
        console.log(f2)
        for(i=2;i<num;i++)
        {
            var f3=f1+f2;
            console.log(f3)
            f1=f2
            f2=f3
        }

    })(8)

    var value=num=>
    {
        var f1=0
        var f2=1
        console.log(f1)
        console.log(f2)
        for(i=2;i<num;i++)
        {
            var f3=f1+f2;
            console.log(f3)
            f1=f2
            f2=f3
        }

    }
    value(10);
