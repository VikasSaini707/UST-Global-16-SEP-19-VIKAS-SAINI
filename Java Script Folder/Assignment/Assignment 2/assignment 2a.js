 //Factorial number    
 console.log('=====Factorial number======')
 function fact(num)
 {
     var fact=1;
     for(i=1;i<=num;i++)
     {
         fact=fact*i
     }
     console.log('Facrorial is ',fact)
 }
 fact(5);

 var value=function fact(num)
 {
     var fact=1;
     for(i=1;i<=num;i++)
     {
         fact=fact*i
     }
     console.log('Facrorial is ',fact)
 }
 value(6);

 (function(num)
 {
     var fact=1;
     for(i=1;i<=num;i++)
     {
         fact=fact*i
     }
     console.log('Facrorial is ',fact)
 })(7)
 
 var value=num=>
 {
     var fact=1;
     for(i=1;i<=num;i++)
     {
         fact=fact*i
     }
     console.log('Facrorial is ',fact)
 }
 value(10);
