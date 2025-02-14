// 03_function/03_rest_parameter.js
function plusOld(a, b) {
  console.log(arguments, Array.isArray(arguments));
  let sum = 0;
  for (let arg of arguments) {
    sum += arg;
  }
  return sum;
}

console.log(plusOld(1, 2));
console.log(plusOld(1));
console.log(plusOld(1, 2, 3, 4, 5));

function plusNew(...nums) {
  console.log(nums, Array.isArray(nums));
  let sum = 0;
  for (let arg of nums) {
    sum += arg;
  }
  return sum;
}
console.log(plusNew(1, 2));
console.log(plusNew(1));
console.log(plusNew(1, 2, 3, 4, 5));

// TODO: 01. teamName, captain, players를 받아 팀 정보를 객체로 반환하는 함수를 작성해보자.

// END

const teamA = createTeamRoster("드래곤즈", "김용석", "이민수", "박지성", "최철호");
console.log(teamA.teamInfo);
console.log(teamA.captain);
console.log(teamA.members);
console.log(teamA.playerCnt);

const teamB = createTeamRoster("이글스", "박민호", "김지훈");
console.log(teamB);
