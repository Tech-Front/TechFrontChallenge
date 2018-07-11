// var Darasa = require('./judeOtenyo');
import Darasa from './judeOtenyo';

standard1 = new Darasa('standard1', 10, ['Jude', 'Joe', 'Jeff', 'Jane', 'Juliet', 'Joan']);
standard2 = new Darasa('standard2', 10, ['Amos', 'Aaron', 'Andrew', 'Ann', 'Abby', 'Ashley']);
standard3 = new Darasa('standard3', 10, ['Simon', 'Shaun', 'Samson', 'Sharon', 'Sarah', 'Sheila']);


class Shule {
    constructor(schoolName) {
        this.name = schoolName;
        this.registry = Array();
    }

    addDarasa(name, darasa) {
        this.registry.push({ name: name, darasa: darasa });
        return this.registry;
    }

    removeDarasa(name) {
        for (let i = 0; i < this.registry.length; i++) {
            if (this.registry[1].name === name) {
                removedDarasa = this.registry.splice(i, 1);
            }
        }
        return this.registry;
    }

    getShule() {
        const currentShule = { shuleName: this.name, darasas: this.registry };
        return currentShule;
    }

    //For doing my something interesting
    getDarasa(darasaName) {
        this.registry.forEach(darasa => {
            if (darasaName === darasa.name) {
                return darasa.darasa;
            }
        });
    }
}

myAwesomeShule = new Shule('myAwesomeShule');

myAwesomeShule.addDarasa('standard1', standard1);
myAwesomeShule.addDarasa('standard2', standard2);
myAwesomeShule.addDarasa('standard3', standard3);

//Something Interesting: Switching someones classes
function moveStudent(studentName, oldClass, newClass) {
    result = myAwesomeShule.getDarasa(oldClass).removeClassMember(studentName);
    if (result.result === true) {
        myAwesomeShule.getDarasa(newClass).addClassMember(result.data);
    } else {
        alert(result.message);
    }
}
//initializing the interesting thing
moveStudent('Jude', 'standard1', 'standard2');