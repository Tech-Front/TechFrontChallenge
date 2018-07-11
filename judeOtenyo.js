 class Darasa {
     constructor(name, size, students) {
         this.name = name;
         this.size = size;
         this.wanafunzi = students;
     }

     addClassMember(enteredStudentName) {
         this.wanafunzi.forEach(student => {
             if (student === enteredStudentName) {
                 return {
                     result: false,
                     data: '',
                     message: 'A student with this name already exists'
                 };
             }
         });

         this.wanafunzi.push(enteredStudentName);
         return {
             result: true,
             data: enteredStudentName,
             message: 'The student was added successfully'
         };
     }

     removeClassMember(enteredStudentName) {
         for (let i = 0; i < this.wanafunzi.length; i++) {
             if (this.wanafunzi[i] === enteredStudentName) {
                 removedName = this.wanafunzi.splice(i, 1);
                 return {
                     result: true,
                     data: removedName,
                     message: '${removedName} was removed successfully from ${this.name}'
                 };
             }
         }
         return {
             result: false,
             data: '',
             message: 'No such student exists in ${this.name}'
         };
     }

     getDarasaMembers() {
         return this.wanafunzi;
     }
 }
 module.exports = Darasa;