# java-calculator-precourse
# 문자열 덧셈 계산기 미션

## 기능 목록

### 1. AddString
- 숫자 배열의 합을 계산하는 기능 구현

### 2. IntConverter
- 문자열 배열을 숫자 배열로 변환
- 음수 입력 시 IllegalArgumentException 발생
- 숫자가 아닌 잘못된 값 입력 시 IllegalArgumentException 발생

### 3. StringSplitter
- 기본 구분자(콤마 `,`와 콜론 `:`)로 문자열 분리
- 커스텀 구분자 `"//[delimiter]\n"` 형식 지원
- 잘못된 커스텀 구분자 입력 시 IllegalArgumentException 발생

### 4. Application
- Console을 통해 사용자 입력 받기
- 입력 문자열 → StringSplitter로 분리 → IntConverter로 숫자 변환 → AddString으로 합계 계산 → 결과 출력

## 실행 예제

### 기본 구분자
- 입력: `1,2:3`  
- 출력: `결과: 6`

### 커스텀 구분자
- 입력: `//;\n1;2;3`  
- 출력: `결과: 6`

### 잘못된 입력
- 입력: `1,a,3`  
- 출력: `IllegalArgumentException: 잘못된 형식입니다.`

- 입력: `-1,2,3`  
- 출력: `IllegalArgumentException: 음수는 입력할 수 없습니다.`
