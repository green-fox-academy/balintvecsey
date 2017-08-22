function Sharpie(color, width) {
  this.color =  color;
  this.width = width;
  this.inkAmount = 100;
  this.use =  function() {
    this.inkAmount -= width;
  };
}

let redSharpie = new Sharpie('red', 10);
console.log(redSharpie.inkAmount);

redSharpie.use();
console.log(redSharpie.inkAmount);
