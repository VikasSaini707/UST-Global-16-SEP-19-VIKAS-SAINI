const message=new Promise(function(resolve,reject)
{
    if(30>20)
    {
        resolve('Success')
    }else{
        reject('Failed')
    }
})

message.then(function(msg)
{
    console.log(msg)
}).catch(function(err)
{
    console.log(err)
})

const employees=new Promise(function(resolve,reject)
{
    if(30>20)
    {
        resolve([
            {
                name:'bill gates',
                age:67
            },
            {
                name:'Mark zuckerberg',
                age:40
            }
        ]
        )
    }else{
        reject('Failed')
    }
})

employees.then(function(data)
{
    console.log(data)
}).catch(function(err)
{
    console.log(err)
})

/////////////////Closure///////////////////////
function outerFunction(counter)
{
    function innerfunction()
    {
        let count;
        count=counter+10;
        return count;
    }
    return innerfunction;
}

let innerfunc=outerFunction(10);
let count=innerfunc();
console.log('Counter Value',count);