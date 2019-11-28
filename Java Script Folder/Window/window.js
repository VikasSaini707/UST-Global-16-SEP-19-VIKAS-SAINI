console.log('Window objects',window);
console.log('This Keyword',this);
console.log(this===window)

// window.alert('Welcome to Java Script class')
// alert('Welcome to class');

// confirm('Are you sure to Delete')  //ok=>true   cancel=>false


let username=prompt('What is your name','Vikas');
console.log('User Name',username)

const person={
    firstname:'Alia',
    age:26,
    lastname:'bhatt',
    getname:function(){
        console.log('THis Keyword ',this)
        return this.firstname+" "+this.lastname
    }
}

let fullname=person.getname()
console.log('Full Name ',fullname)




