// 03_function/04_default_arguments.js
function defaultParam(name = "아무개") {
  console.log(name + "님 반갑습니다.");
}

defaultParam("홍길동");
defaultParam();

function required() {
  throw new Error("필수 입력 항목입니다.");
}
//TODO: 01. name이 전달되지 않으면 "필수 입력 항목입니다." 내용의 에러가 발생하게 해보자.
function useRequired(name = required()) {
  console.log(name + "");
}

//END

useRequired("홍길동");
useRequired();
