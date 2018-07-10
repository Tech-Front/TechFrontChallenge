class Shule{
    constructor(shuleName){
        this.shuleName  = shuleName;
        this.shule = {};
    }
    // adds a darasa to the school Registy 
    // returns the modified dictionary representation of the school.
    // arguements: String darasaName, Darasa darasa
    // returns Dictionary representation of school
    
    addDarasa(name, darasa){
        this.shule[name] = darasa;
        return this.shule;
    }
    
    
    
    
    
    
    // removes a darasa entry from the school Registry. 
    // arguements: String DarasaName 
    // returns: modified Dictionary representation of school
    removeDarasa(name){
        delete this.shule[name];
        return this.shule;
    } 
    
    
    
    
    
    // returns an unmodifieable array of shuleName and Dictionary representation of Shule
    getShule(){
        const ret = this.shuleName;
        return [ret, this.shule];
    }
}