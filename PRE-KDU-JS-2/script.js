
let add = document.getElementById("b1");
let sub = document.getElementById("b2");
let mulp = document.getElementById("b3");
let div = document.getElementById("b4");
let res = document.getElementById("input");
let output;

add.addEventListener("click", function () {
  let a = document.getElementById("num1");
  let num1 = parseFloat(a.value);

  let b = document.getElementById("num2");
  let num2 = parseFloat(b.value);

  res.style.color = "black";
  output = num1 + num2;
  res.innerText = `Result: ${output}`;
});

sub.addEventListener("click", function () {
  let a = document.getElementById("num1");
  let num1 = parseFloat(a.value);

  let b = document.getElementById("num2");
  let num2 = parseFloat(b.value);

  res.style.color = "black";
  output = num1 - num2;
  res.innerText = `Result: ${output}`;
});

mulp.addEventListener("click", function () {
    let a = document.getElementById("num1");
    let num1 = parseFloat(a.value);
  
    let b = document.getElementById("num2");
    let num2 = parseFloat(b.value);
  
    res.style.color = "black";
    output = num1 * num2;
    res.innerText = `Result: ${output}`;
  });

div.addEventListener("click", function () {
    let a = document.getElementById("num1");
    let num1 = parseFloat(a.value);
  
    let b = document.getElementById("num2");
    let num2 = parseFloat(b.value);
  
    res.style.color = "black";
    output = num1 / num2;
    if(num2==0){
        res.innerText=`Cannot divide by zero.`
    }else{
        res.innerText = `Result: ${output}`;
    }
  });

