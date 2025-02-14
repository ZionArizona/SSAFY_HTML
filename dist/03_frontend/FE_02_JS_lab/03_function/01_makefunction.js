// 03_function/01_makefunction.js
function add(x, y) {
  return x + y;
}
console.log(add(3, 4));

let minus = function (x, y) {
  return x - y;
};
console.log(minus(3, 4));

// 즉시 실행 함수
(function (name) {
  console.log("hello, " + name);
})("hong");

let multi = new Function("x", "y", "return x*y");
console.log(multi(3, 4));
