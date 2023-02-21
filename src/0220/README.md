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
- 
![image](https://user-images.githubusercontent.com/48954288/220216596-59904bd8-a90f-4140-845c-0a15630e3b9d.png)

- Datasource 클래스 파일 생성

![image](https://user-images.githubusercontent.com/48954288/220216673-01f39a5d-4347-44b9-99c1-903654717fe8.png)

- AffirmationCard 함수로 하나의 카드 형성(이 Card가 lazyColumn으로 쭉 형성)
- AffirmationList 함수에서 lazyColumn(스크롤 가능한 열), 후행람다로 AffirmationCard에 값 부여
- AffirmationApp 함수에서 앞의 Datasource 클래스의 메소드로 Data불러옴

![image](https://user-images.githubusercontent.com/48954288/220216800-ee7efac9-4979-410d-8e0e-61b590774d32.png)

