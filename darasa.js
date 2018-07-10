class Darasa{
    constructor(members){
        this.members = members;
    }

    
    // adds a new  member into the Darasa. 
    // This method does not allow for duplicate Darasa members. If this member exists, handle it 
    // as you please. 
    // arguements: String name 
    // returns: Darasa member added or something else if member exists 
    
    addClassMember(name){
        if(this.members.indexOf(name) < 0){
            this.members.push(name);
            return 'added member';
        };
        return 'member already exists';
    }

    // removes member from this Darasa. 
    // If member does not exist in the Darasa, handle it as you please. 
    // Arguements: String name
    // returns: Darasa member removed from class or something else if member does not exist
    removeClassMember(name){
        for(var i = 0; i < this.members.length; i++){
            if (this.members[i] == name){
                this.members.splice(i, 1);
                return name;
            };
        }
        return 'doesn\'t exist';
    }
    
    
    // returns the members of this class
    getDarasaMembers(name){
        return this.members;
    }
    
}