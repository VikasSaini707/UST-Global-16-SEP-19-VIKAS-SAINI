function showPassword()
{
    var x = document.getElementById("psw");
        if (x.type === "password") 
        {
             x.type = "text";
        } else {
             x.type = "password";
        }
}

function keyPress()
{
    let nameKeyField = document.getElementById('name').value
   // document.getElementById('name').innerHTML = nameKeyField
    nameKeyField = nameKeyField.trim();

    let passKeyField = document.getElementById('psw').value
   // document.getElementById('psw').innerHTML=passKeyField
    passKeyField=passKeyField.trim();
    
    if(passKeyField.length >= 6 && nameKeyField.length >= 5){
        document.getElementById('clickButton').disabled = false
        document.getElementById('clickButton').style.cursor = "pointer";
    }else{
        document.getElementById('clickButton').disabled = true
    }
}