class Dateable {
  constructor(age) {
    this.age = age;
  }
  
  getYoungestPerson() {
    return Math.floor(this.age / 2 + 7);
  }
}

const myAge = new Dateable(16);
console.log(`${myAge.age}-year olds should date somebody who is at least ${myAge.getYoungestPerson()} years old.`);
