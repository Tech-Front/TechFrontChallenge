function Shule() {
  this.shuleName = [];
  this.shule = {};

  // Add a darasa to shule
  this.addDarasa
  function = (name, darasa) {
    this.shule[name] = darasa;
    return 'The darasa has been added';
  }

  // Remove a darasa from a shuleName
  this.removeDarasa = function(name) {
    delete this.shule[name];
    return 'The darasa has been remove';
  }

  //
  this.getShule = function() {
    const shuleName = this.shuleName;
    return [shuleName, this.shule];
  }
}


var classOne = new Darasa();
var classTwo = new Darasa();
var classTree = new Darasa();

classOne.addClassMember("victor");
classOne.addClassMember("kariuki");
classTwo.addClassMember("maina");
classTwo.addClassMember("wahome");
classThree.addClassMember("innocent");
classThree.addClassMember("main");
