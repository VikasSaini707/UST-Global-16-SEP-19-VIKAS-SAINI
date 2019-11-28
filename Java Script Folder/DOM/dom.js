let h1element=document.getElementById('demo')
console.log('Element ',h1element)

console.log('element text ',h1element.textContent) //show only text inside element

h1element.textContent='Good Evening'  //change content of element
console.log('New Content ',h1element.textContent)

let buttonElement=document.createElement('button') //create new element
buttonElement.textContent='Click me !!!'
console.log('Button Element ',buttonElement)

document.body.appendChild(buttonElement);
//////////////////////////////////////////////
let ulElement=document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')

li1Element.textContent='JAVA'
li2Element.textContent='SQL'
li3Element.textContent='Java Script'

ulElement.append(li1Element)
ulElement.append(li2Element)
ulElement.append(li3Element)

document.body.appendChild(ulElement);

//////////////style///////////////////////////////
h1element.style.color="red";
h1element.style.fontFamily='chiller';
h1element.style.fontSize='100px';

///////////////Event////////////////////////
function showMessage(){
    alert('Hii Hello Welcome!!!!!!!')
}

function changeColor(){
    let element=document.getElementById('mover')
    element.style.color='green';
}
function removeColor(){
    let element=document.getElementById('mover')
    element.style.color='black';
}

function printHello(){
    console.log('Hello')
   let username= document.getElementById('username').value //when we take input from user then we use value
   document.getElementById('showUsername').textContent=username;
}

let name='Vini'
let age=23
let mobile=8816832707
console.log('Name is '+name+' and Age is '+age+' and mobile is '+mobile)
console.log(`Name is ${name} Age is ${age} Mobile is ${mobile}`) //string Interpolation ,only used in case of `` backstrick
console.log(`2+2=${2+2}`)










