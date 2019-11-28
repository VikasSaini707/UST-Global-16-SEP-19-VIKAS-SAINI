

function first(callback) {
    setTimeout( function() {
        console.log('First Func');
        callback();
    },2000)
}

function second(){
    console.log('second func');
    
}

first(second);