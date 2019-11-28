const person={
                name:'Sundra',
                age:25,
                color:'white',
                address:{
                            city:'Bangalore',
                            state:'Karnataka',
                            pincode:590001
                        },
                hobbies:['coding','singing','bird watching']
            }
console.log('JavaScript person Object',person);

const jsonObject=JSON.stringify(person)
console.log('JSON person Object',jsonObject)

const jsObject=JSON.parse(jsonObject)
console.log('JavaScript person Object',jsObject)

localStorage.setItem('email','billgate@gmail.com')
const emailId=localStorage.getItem('email')
console.log('Email ID',emailId)
localStorage.clear();
