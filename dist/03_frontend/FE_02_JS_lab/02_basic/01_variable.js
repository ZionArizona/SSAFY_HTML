// 02_basic/01_variable.js
function test() {
  if (true) {
    globalData = "Don't use";
    var varData = "Once upon a time we used this one.";
    let letData = "letData";
    const constData = "constData";
    //constData = 30;                // const 변수 재할당 불가

    // TODO: globalData, varData, letData, constData 중 호출 가능한 변수와 호출 불가능한 변수를 확인하시오.
    // console.log(globalData);
    // console.log(varData);
    // console.log(letData);
    // console.log(constData);
    // END
  }
  // TODO: globalData, varData, letData, constData 중 호출 가능한 변수와 호출 불가능한 변수를 확인하시오.
  console.log(globalData, varData);
  // END
}
test();
// TODO: globalData, varData, letData, constData 중 호출 가능한 변수와 호출 불가능한 변수를 확인하시오.
console.log(globalData);
// END
