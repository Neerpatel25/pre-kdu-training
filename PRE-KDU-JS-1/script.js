let a = document.getElementById("first")
let b = document.getElementById("second")
let c = document.getElementById("display")
let counter=0
a.addEventListener("click",function(){
    counter++
    c.innerHTML=`${counter}`    
})
b.addEventListener("click",function(){  
    counter--
    c.innerHTML=`${counter}`   
})

