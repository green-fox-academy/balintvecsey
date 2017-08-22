function Animal() {
  this.hungerLevel = 50;
  this.thirstLevel = 50;
  this.eat = function() {
    this.hungerLevel--;
  };
  this.drink = function() {
    this.thirstLevel--;
  };
  this.play = function() {
    this.hungerLevel++;
    this.thirstLevel++;
  };
}

function Farm() {
  this.listOfAnimals = [];
  this.emptySlots = 10;
  this.breed = function() {
    if(this.emptySlots > 0) {
      this.listOfAnimals.push(new Animal());
      this.emptySlots--;
    }
  };
  this.slaughter = function() {
    let indexOfLeastHungryAnimal = 0;
    for (var i = 0; i < this.listOfAnimals.length; i++) {
      if(this.listOfAnimals[i].hungerLevel > this.listOfAnimals[indexOfLeastHungryAnimal].hungerLevel) {
        indexOfLeastHungryAnimal = i;
      }
    }
    this.listOfAnimals.splice(indexOfLeastHungryAnimal, 1);
    this.emptySlots++;
  };
}
