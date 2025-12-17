let x = 1;
let y = 0;

while(x < 1000){
    if (x%3==0 || x%5==0){
        y = y + x
    }
    x = x + 1
}

console.log(y)