# godo-spring-board

- Springboot 토이 프로젝트 '게시판'
- 예상 기능 : 게시판 CRUD, 게시글 CRUD

## src 구조
- main
  - java : .java 파일 생성
    - com.godo.spring.boardproject : 게시판 프로젝트 java 파일들 위치한 패키지
      - controller : 컨트롤러 패키지 포함
      - entity : 데이터베이스 테이블과 매핑될 클래스들 위치
      - repository : Entity의 CRUD 제공하는 레포지토리 위치
      - BoardProjectApplication : 어플리케이션 main 메소드 포함
  - resources : 정적 리소스
    - templates : Views 구현한 html 파일들 위치
      - board
    - application.properties : 제외 예정 (어플리케이션 환경설정 파일)
    - application.yml : 어플리케이션 환경설정 파일
- test : main과 동일한 구조로 test 파일 생성
- build.gradle : 어플리케이션의 dependency(의존성) 관리 매니저 gradle의 환경 파일
- settings.gradle : 상하위 프로젝트 간 구성 정보 포함한 파일
