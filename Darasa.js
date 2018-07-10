function Darasa(classMember) {
  this.classMembers = [];

  // Add a class member
  this.addClassMember = function(memberName) {
    if (this.classMembers.indexOf(memberName) === 0) {
      this.classMembers.push(classMembers);
      return 'A members has been added';
    } else {
      return 'The class member already exists';
    }
  }

  // Remove a class member
  this.removeClassMember = function(memberName) {
    for (var i = 0; i < classMembers.length; i++) {
      if (this.classMembers[i] === memberName) {
        this.classMembers.splice(i, 1);
        return 'A member has been removed';
      }
    }
  }

  // Display the members
  this.displayClassMember = function() {
    return `${this.classMembers} are the class members`;
  }
}
}
