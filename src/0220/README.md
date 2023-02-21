# 0220 안드로이드
## 컬렉션 고차함수 활용

- filter: 목록에서 boolean true값 필터링

![image](https://user-images.githubusercontent.com/48954288/220215291-92eb986f-4e1d-45dc-acb3-89ad59164491.png)

- groupBy: 특정 변수 기준

![image](https://user-images.githubusercontent.com/48954288/220215474-99b68281-e293-4417-8eae-cc875155d1ed.png)

![image](https://user-images.githubusercontent.com/48954288/220215813-86c863b7-9956-4de8-90fe-704f661acffc.png)

![image](https://user-images.githubusercontent.com/48954288/220215826-a71e2d71-470b-4add-ac89-6a68b4ef1a06.png)

- sortedBy: 변수 기준 정렬, String, Int ...

![image](https://user-images.githubusercontent.com/48954288/220215928-f3d46bc4-c6ae-40a5-af5e-8a38133c2a8c.png)

## list를 이용하여 jetpack compose서 lazyColumn으로 스크롤 가능 앱 만들기
### Affirmation
- 구조

![image](https://user-images.githubusercontent.com/48954288/220216384-9acc3c3f-c541-4923-8997-a75c863f5320.png)

- 모델 데이터 클래스 생성

![image](https://user-images.githubusercontent.com/48954288/220216596-59904bd8-a90f-4140-845c-0a15630e3b9d.png)

- Datasource 클래스 파일 생성

![image](https://user-images.githubusercontent.com/48954288/220216673-01f39a5d-4347-44b9-99c1-903654717fe8.png)

- AffirmationCard 함수로 하나의 카드 형성(이 Card가 lazyColumn으로 쭉 형성)
- AffirmationList 함수에서 lazyColumn(스크롤 가능한 열), 후행람다로 AffirmationCard에 값 부여
- AffirmationApp 함수에서 앞의 Datasource 클래스의 메소드로 Data불러옴

![image](https://user-images.githubusercontent.com/48954288/220216800-ee7efac9-4979-410d-8e0e-61b590774d32.png)

- 실행

![image](https://user-images.githubusercontent.com/48954288/220217419-8c7c2ab6-b2ed-4836-b1ca-5c1f90fb8a76.png)


### Courses
- 위의 데이터 파일, lazyColumn 활용하기
- GridCells.Fixed(Int)를 사용하여 lazy당 2개의 card가 놓일 수 있게 고정

![image](https://user-images.githubusercontent.com/48954288/220217743-c74e82de-4557-4a7a-8c94-d53131a4b601.png)

### Woof
- MaterialTheme 수정을 통해 앱에 색감, font 수정

![image](https://user-images.githubusercontent.com/48954288/220217842-b33c69fd-0a45-4b6a-a857-e8b1d4ef3b2c.png)

## 금주 모각소 느낀점
- 해킹 공부를 시작한 시점에서 논문을 읽으며 요약하고 공부하고 있는 경주에게 논문 선택 방법, 논문 읽는 방법에 대해 질문함.
- 구현이 된 우성이의 네이버 웹툰 베스트댓글 크롤링이 신기함
- 비슷한 공부를 하고 있는 준태의 persona 앱에서 회원가입 및 로그인에 대한 가벼운 공부를 함
- 진로에 대한 고민이 사실 많은 주였음(수강신청, 수많은 학생회, 동아리 일을 하며 생각하는 시간이 많았음..) --> 해킹공부를 시작함 모각소 습관을 들여 지속적으로 학습한 내용을 기록할 것 
https://github.com/kmkkkp/dreamhack/tree/main/webhacking
