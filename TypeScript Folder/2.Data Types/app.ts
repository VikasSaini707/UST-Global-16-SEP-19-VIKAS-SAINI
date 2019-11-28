let myName : string = "Vini";

console.log(myName,typeof myName);

let age : number;

console.log(age,typeof age);

let mobileNumber= 8523698774;

console.log(mobileNumber,typeof mobileNumber);

let address;

console.log(address, typeof address)

let calAge= function(): void{
    console.log("Age is 23");
    
}

calAge();

class Person{
    constructor(public name:string,public age:number){

    }
}
let person1=new Person("vini",23)
console.log(person1);

class Student extends Person{
    constructor(name:string,age:number,public rollNo:number){
        super(name,age);
    }
}

let student1=new Student("john",24,7);
console.log(student1);

