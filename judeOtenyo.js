export class Darasa {
    constructor(name, size) {
        this.name = name;
        this.size = size;
        this.wanafunzi = Array("Jude");
    }

    addClassMember(enteredStudentName) {
        this.wanafunzi.forEach(student => {
            if (student === enteredStudentName) {
                return {
                    result: false,
                    message: 'A student with this name already exists'
                };
            }
        });

        this.wanafunzi.push(enteredStudentName);
        return {
            result: true,
            message: 'The student was added successfully'
        };
    }

    removeClassMember(enteredStudentName) {
        for (let i = 0; i < this.wanafunzi.length; i++) {
            if (this.wanafunzi[i] === enteredStudentName) {
                removedName = this.wanafunzi.splice(i, 1);
                return {
                    result: true,
                    message: '${removedName} was removed successfully from ${this.name}'
                };
            }
        }
        return {
            result: false,
            message: 'No such student exists in this class'
        };
    }

    getDarasaMembers() {
        return this.wanafunzi;
    }
}