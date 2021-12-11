# 로또

## Step 2. 로또 (자동)

### 프로그래밍 요구사항
* **모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다.**  
* 핵심 로직을 구현하는 코드와 UI 담당 로직을 구분한다.
* 자바 코드 컨벤션을 지킨다.
* `else` 예약어, `switch/case`를 사용하지 않는다.
* 함수의 길이가 15라인을 넘어가지 않도록 구현한다.

### 구현 기능 목록
- [ ] 로또 구입 금액을 입력하고 로또 개수를 계산한다(n개). (로또 1개 가격은 1000원이다)
- [ ] 로또 개수(n개)만큼 하나의 로또에 6개의 랜덤 숫자를 반환한다 (단, 최대값은 45)
- [ ] 로또 당첨 번호를 입력 할 수 있다. (형식: 1, 2, 3, 4, 5, 6)
- [ ] 일치하는 숫자 개수에 대한 통계 값을 반환한다.
- [ ] 로또 구매에 대한 수익률을 계산한다.
- [ ] 수익률이 1이하면 손해, 1이상이면 이익에 대한 판정값을 반환한다.
### Commit Message Conversion
#### 나만의 양식 : [종류] 커밋 메세지

feat (feature) 기능 추가  
fix (bug fix)  
docs (documentation)  
style (formatting, missing semi-colons, ..)  
refactor  
test (when adding missing tests)  
chore (maintain)  