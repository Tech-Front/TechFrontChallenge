function Shule() {
  this.shuleName = [];
  this.shule = {};

  // Add a darasa to shule
  this.addDarasa
  function = (name, darasa) {
    this.shule[name] = darasa;
    return 'Darasa has been added';
  }

  // Remove a darasa from a shuleName
  this.removeDarasa = function(name) {
    delete this.shule[name];
    return 'Darasa has been remove';
  }

  //
  this.getShule = function() {
    const shuleName = this.shuleName;
    return [shuleName, this.shule];
  }
}


var class= new Darasa();


class.addClassMember("Dennis");

