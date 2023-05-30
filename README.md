# LMS (도서관 관리 프로그램)
## Library management program for librarians with JDBC

외부 프레임워크 없이 Vanilla로 설계


Project Flow
 -  구상 - 전제 조건 확인 - 개발 및 구현 - 테스트 및 평가

### **구상**

Something… Management System (물류, 도서, 상점 등)

1. **Database Connection Manager**
    - JDBC를 사용해서 이번에 배우는 MySQL과 상호작용이 가능하게 설계
2. **CRUD 및 각 물건 별 현재 Status 조회**
    - (분류 기준을 정해서) 예외 처리가 가능하게 설계

**메뉴**

**회원**

- 회원 등록

        회원 이름, 전화번호, ID 

- 회원 조회

        회원 이름, 전화번호

- 회원 수정

        회원 이름, 전화번호 

- 회원 삭제

        ID

**도서**

- 도서 등록

        도서 이름, 출판사, 저자, ID

- 도서 조회

        도서 이름, 출판사, 저자

- 도서 삭제

        ID

**대여**

- 대여 조회 

        - 전체 리스트 조회
        - 회원별 대여 도서 조회
        - 도서 별 조회 

- 대여

        - 회원 ID, 도서 ID, 대여 날짜 → 테이블 저장

- 반납

        - 도서 ID만 받아서 삭제



### 전제조건 ###
1. 책은 종류별로 한 권씩만 있다고 가정한다.
2. 책은 최대 2권까지 대여할 수 있다.
3. 책의 대여일 수는 일주일이고, 넘은 시간만큼 연체일로 계산해 책을 빌릴 수 없게 한다.


클래스 기본 구조
 - ver 1.0 - 클래스 기본 구조 및 도메인 생성
```
Class ManagementController

Class Member
Properties:
- String name
- String phoneNumber
- String id
Methods:
- register(String name, String phoneNumber, String id) throws ValidationException, DuplicationException
- findMember(String name, String phoneNumber) throws DatabaseException
- updateMember(String name, String phoneNumber) throws ValidationException, DatabaseException
- deleteMember(String id) throws DatabaseException

Class Book

Properties:
- String title
- String publisher
- String author
- String id
Methods:
- register(String title, String publisher, String author, String id) throws ValidationException, DuplicationException
- findBook(String title, String publisher, String author) throws DatabaseException
- deleteBook(String id) throws DatabaseException

Class Rental

Properties:
- String memberId
- String bookId
- LocalDate rentalDate
- boolean isOverdue
Methods:
- viewAllRentals() throws DatabaseException
- viewRentalsByMember(String memberId) throws DatabaseException
- viewRentalsByBook(String bookId) throws DatabaseException
- rentBook(String memberId, String bookId) throws ValidationException, RentalException, DatabaseException
- returnBook(String bookId) throws DatabaseException
- checkOverdue(String bookId) throws DatabaseException

Class ValidationException extends Exception
Properties:
- String message

Class DuplicationException extends Exception
Properties:
- String message

Class DatabaseException extends Exception
Properties:
- String message

Class RentalException extends Exception
Properties:
- String message
```
