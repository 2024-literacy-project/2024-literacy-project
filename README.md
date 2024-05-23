
# 📚문해력 향상 서비스 앱 README



![readme_mockup2](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/eb271755-76d0-4bd3-aaf5-5cf3eadfaa03)

<h1>팀: 🌊 낭만독해</h1>




 

## 1. 프로그램 기획

 ### ① 지역사회문제점 및 시장 조사

 #### 학생들의 국어 학업성취도 해마다 감소:
 - 경제협력개발기구(OECD) 보고서에 따르면 2021년 한국 학생들의 디지털 정보에 대한 사실과 의견 식별률은 25.6%로 회원국 평균 
   (47.4%)에 크게 미달했다. .
 #### 스마트폰 사용으로 글보다 영상을 접하는 시간이 증가:
 - 영상에 익숙해지면서 긴 글을 읽기 어려워 하며, 최근 숏폼이 인기를 끌면서 문해력 저하 현상
 #### 활자보다 영상에 익숙한 MZ세대:
 - 문해력 저하는 학습능력 저하로 이어질 수 있고, 사회의 지적 기반을 허약해짐 => 정보를 비판적으로 받아들이는 능력 저하




### ② 프로젝트 소개

  - **매일 업데이트 글 추천**: 
    - 문해력 향상을 목표로, 사용자들이 매일 새로운 글과 시를 접하고, 다양한 장르와 스타일의 글을 접할 수 있다. 자신의 한정되어 있던 문학 범위를 넓힌다.
  - **간단한 문해력 테스트**: 
 - 제공된 글이나 시를 읽은 후, 간단한 문해력 테스트를 치뤄 사용자의 문해력 기술을 자연스럽게 연습하고 향샹시킬 수 있다.
  - **커뮤니티 기능**: 
    - 사용자들은 오늘 읽은 글,시등 이에 대해 자신의 생각을 공유하고,  다른 사람들에게 의견을 듣거나 문해력 관련된 다양한 질문과 대화를 나눌 수 있는 공간이다. 서로 격려하고, 학습 경험을 공유하며 문해력 향상을 위한 공간을 제공한다.
      
 ### ③ 프로젝트 선정 이유:
 - 글 제공,문해력 퀴즈 ,소통 커뮤니티 기능을 통해 사용자가 글을 많이 접하고 문해력을 향상시킬 수 있는 웹/앱 애플리케이션을 제공하여 문해력 교육 및 향상을 지원함으로써 사회적 문제를 해결하는데 기여하고자 함.
 


 ### 팀원 소개
 
  |팀원이름|구현기능|역할|깃허브ID|
  |----|-----|-----|-----|
  |안홍영| 메인페이지/상세페이지 |팀장| [@inredzero](https://github.com/inredzero) |
  |김민수| 메인페이지/상세페이지 |팀장| [@moressangplease](https://github.com/moressangplease)|
  |박세연| 소통게시판 |팀원| [@SeYeon](https://github.com/se-3-yeon) |
  |진윤재| 소통게시판 |팀원| [@Realyunjae](https://github.com/Realyunjae) |

## 2.채택한 개발 기술과 브랜치 전략


 ###   ① 개발 환경 
 ###  프로그래밍 언어 및 프레임워크
  

#### Spring boot
-   Spring Boot Java 기반의 오픈 소스 경량 프레임워크로, Spring 프레임워크 위에서 동작
#### thymeleaf
- Thymeleaf는 서버 사이드 자바 템플릿 엔진으로, XML/XHTML/HTML5 컨텐츠를 웹 애플리케이션에서 동적으로 생성하는데 사용.
#### MySQL
-  MySQL을 데이터베이스 관리 시스템으로 사용
#### MyBatis
-  데이터베이스와 객체 간의 자동 매핑 기능을 제공하여, SQL 쿼리 실행 및 결과 매핑
#### CSS 
-  웹 페이지의 레이아웃, 색상, 글꼴 등의 스타일을 정의하는 스타일 시트 언어


### ② 버전 및 이슈관리
  -  Github, Github Issues, Github Project
   <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  

### ③ 협업 툴
 <div align=left>
 <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white"></div> 
 <div align=left> <a href="https://www.notion.so/Find-Dog-2f081d1cdc6c46f0b27c2a591f2be77d?pvs=4">
 <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"></div>
 </a><div align=left>
 <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"></div>
<div align="left">
    <img src="https://github.com/DBTeamP/DBProject/assets/135615995/470c2391-acbd-48b4-b410-5cd0afb1de96" alt="사진" width="30" height="30"> Chrome Remote Desktop
</div>
<div align="left">
    <img src="https://github.com/DBTeamP/Find-Dog/assets/135615995/5e61746a-f6f2-4912-a31e-ca8b9755d8fe" alt="사진" width="30" height="30"> Google Meet
</div>

###  ④ 브랜치전략
- 각자 맡은 기능에따라 브랜치를 생성하여
- 브랜치명은 feature/기능/(자기 깃허브 닉네임)
- feature/ : 기능단위로 독립적인 개발환경을 위해 사용.


## 3. 시장 조사

 #### 학생들의 국어 학업성취도 해마다 감소:
 - 경제협력개발기구(OECD) 보고서에 따르면 2021년 한국 학생들의 디지털 정보에 대한 사실과 의견 식별률은 25.6%로 회원국 평균 
   (47.4%)에 크게 미달했다. .
 #### 스마트폰 사용으로 글보다 영상을 접하는 시간이 증가:
 - 영상에 익숙해지면서 긴 글을 읽기 어려워 하며, 최근 숏폼이 인기를 끌면서 문해력 저하 현상
 #### 활자보다 영상에 익숙한 MZ세대:
 - 문해력 저하는 학습능력 저하로 이어질 수 있고, 사회의 지적 기반을 허약해짐 => 정보를 비판적으로 받아들이는 능력 저하


## 4. 유사 프로그램 분석
### ① 이지펜 (ezpen)
  <div align="left"> <img src="https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/d96717a8-8e95-43cc-943c-8cb5aeedfd4a)" alt="사진" width="150" height="150">

- 문학,비문학과 같은 교육적인 글만 제공 
- 정적인 콘텐츠 제공


### ② 차별화 전략
- 1. 매일 바뀌는 독특한 콘텐츠 제공하여 사용자들에게 새로운 경험 제공

- 2. 다양한 글의 형태 제공: 호김심 자극, 간단한 문제풀이 콘텐츠 제공

- 3. 사람들과의 자유로운 소통: 커뮤니티 기능을 제공하여, 문해력에 대한 자료로운 소통 제공

     
## 5. 프로젝트 구조
### 논리/물리 ERD

 ![KakaoTalk_Photo_2024-05-23-01-19-05 001](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/0c368ca5-dd16-4a83-b347-74549ef24156)
 
 ![KakaoTalk_Photo_2024-05-23-01-19-05 002](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/d4966ab9-1bc2-4644-8c57-94f1cc47aa23)

  ```
 

 
 ```

   
## 6. 프로그램 기능 및 동작 방식 

## ① 메인 게시판 기능


## ② 글 상세 페이지 게시판 기능


## ③ 커뮤니티 게시판 기능


## ④ 게시판 댓글  기능






## 역할분담
## 1.메인 게시판 기능
### 담당: 안홍영, 김민수
#### 😼안홍영
 ![image](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/e19d9de0-60ea-4410-b57e-373b0708c76f)
 
- 구현 기능
- 구현 기능
  
#### 😝김민수
 ![image](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/f26f3eb3-f090-4131-8562-6f719d0e3606)
- 구현 기능
- 구현 기능

## 2.커뮤니티 게시판
### 담당: 진윤재 , 박세연
#### 🐶박세연
 ![image](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/283f438d-4f50-4309-a824-92a3c862167e)
- 게시판 DB 작성
- 게시판 글 추가, 삭제, 수정
- 각 게시판 Css구현
#### 👻진윤재
 ![image](https://github.com/2024-literacy-project/2024-literacy-project/assets/129252557/4e215703-4e20-4f1f-80ea-f8c247ab1be7)
- 게시판 리스트 틀
- 게시판 댓글 추가 기능 구현 
- 게시판 댓글 삭제 


## 낭만독해팀 작업관리

- GitHub issue, 학교에서 대면으로 진행상황 공유
- 매일  짧은 회의를 통해 notion에 회의내용을 기록함.
- notion에 역할 분담,
- 매일 학교에서 짧은 회의를 통해 notion 에 회의내용을 기록함.
  
#### 개발 기간
-  개발 기간 : 2024-05-10 ~ 2024-05-23
  
## 7.프로젝트 후기

### 안홍영
- 
### 김민수
- 
### 박세연
- 
### 진윤재
- 


