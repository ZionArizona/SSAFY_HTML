// 03_function/05_call_by_value.js
function changeAge(age) {
  age += 100;
}

let age = 10;
changeAge(age);
console.log(age);

function changeMaker(car) {
  car.maker = "KIA";
  car = {
    maker: "현대",
    model: "아반",
    year: 2016,
  };
}

let mycar = {
  maker: "기아자동차",
  model: "쏘렌토",
  year: 2016,
};

changeMaker(mycar);

console.log(mycar.maker);
console.log(mycar.model);
