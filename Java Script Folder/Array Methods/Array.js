const hobbies=['sleeping','dancing','playing','eating'];
console.log(typeof hobbies);  //return object

const ArrayOrNot=Array.isArray(hobbies); ///to check weather array or not
console.log('========after isArray method==========');
console.log(ArrayOrNot);

const include=hobbies.includes('eating'); //search element
console.log('=========after include method===========');
console.log(include);

const addElement=hobbies.push('cooking','volleyball'); //add element at last
console.log('=============after push method===========');
console.log('new length',addElement);
console.log('new Array');
console.log(hobbies)

const delElement=hobbies.pop(); // delete element from last
console.log('============after pop method===========');
console.log('deleted element=',delElement);
console.log('new Array');
console.log(hobbies)

const length=hobbies.unshift('Nimismatics','singing');//to add element at first
console.log('============after unshift method==============');
console.log('New Array=',hobbies);
console.log('new length=',length);

const elem=hobbies.shift(); //to delete element from first
console.log('=============after shift method==============');
console.log('New Array=',hobbies);
console.log('deleted element=',elem);

const arr=hobbies.splice(1,2,'pubg','movie','trekking'); //to add and delete eleent in between array
console.log('==============after splice method==============');
console.log('New Array=',hobbies);
console.log('deleted elements',arr);

const array=hobbies.slice(2,5); //doesn not modify original array ,it just return remove elements as an array
console.log('==============after slice method============');
console.log(hobbies);
console.log('removed elements as an array',array)

const index=hobbies.indexOf('eating',3); //to find index
console.log('==============after indexOf method============');
console.log('index is=',index);

const str=hobbies.join(' -- ') //to add seperator and it return string
console.log('==============after join method============');
console.log(str);

const numbers=[100,200,300,400];
console.log(numbers);
console.log('============after map method===========')
const numbers1=numbers.map(function(value,index)
{
    let newValue=value+50;
    return newValue;
})
console.log(numbers1);
console.log('===========using fat arrow===============')
const numbers2=numbers.map(value=>value+50);
console.log(numbers2)

console.log();
console.log('==========after using filter method=======')
const numbers3=numbers.filter(function(value,index)
{
    if(value>200)
    return true;
    else
    return false;
})
console.log(numbers3)
console.log('===========using fat arrow===============')
const numbers4=numbers.filter(value=>value>200);
console.log(numbers4)




















