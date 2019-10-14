Drop table EMP;
Drop table DEPT;

CREATE TABLE `DEPT` (
  `DEPTNO` SMALLINT,
  `DNAME` varchar(22) NOT NULL,
  `LOC` varchar(22) NOT NULL,
  PRIMARY KEY (`DEPTNO`)
);

CREATE TABLE IF NOT EXISTS `EMP` (
  `EMPNO` smallint primary key,
  `ENAME` varchar(22) NOT NULL,
  `JOB` varchar(22) NOT NULL,
  `MGR` smallint,
  `HIREDATE` date NOT NULL,
  `SAL` int NOT NULL,
  `COMM` int,
  `DEPTNO` smallint NOT NULL,
  Constraint fk_EMP_DEPTNO Foreign key (DEPTNO) References DEPT(DEPTNO)
);

insert into DEPT values( '10' , 'Accounting' , 'New York' );
insert into DEPT values( '20' , 'Research' , 'Dallas' );
insert into DEPT values( '30' , 'Sales' , 'Chicago' );
insert into DEPT values( '40' , 'Operations' , 'Boston' );

insert into EMP values( '7369' , 'Smith' , 'Clerk' , '7902' , '1980-12-17' , '800' , null , '20' );
insert into EMP values( '7499' , 'Allen' , 'Salesman' , '7698' , '1981-02-20' , '1600' , '300' , '30' );
insert into EMP values( '7521' , 'Ward' , 'Salesman' , '7698' , '1981-02-22' , '1250' , '500' , '30' );
insert into EMP values( '7566' , 'Jones' , 'Manager' , '7839' , '1981-04-02' , '2975' , null , '20' );
insert into EMP values( '7654' , 'Martin' , 'Salesman' , '7698' , '1981-09-28' , '1250' , '1400' , '30' );
insert into EMP values( '7698' , 'Blake' , 'Manager' , '7839' , '1981-05-01' , '2850' , null , '30' );
insert into EMP values( '7782' , 'Clark' , 'Manager' , '7839' , '1981-06-09' , '2450' , null , '10' );
insert into EMP values( '7788' , 'Scott' , 'Analyst' , '7566' , '1982-12-09' , '3000' , null , '20' );
insert into EMP values( '7839' , 'King' , 'President' , null , '1981-11-17' , '5000' , null , '10' );
insert into EMP values( '7844' , 'Turner' , 'Salesman' , '7698' , '1981-09-08' , '1500' , '0' , '30' );
insert into EMP values( '7876' , 'Adams' , 'Clerk' , '7788' , '1983-01-12' , '1100' , null , '20' );
insert into EMP values( '7900' , 'James' , 'Clerk' , '7698' , '1981-12-03' , '950' , null , '30' );
insert into EMP values( '7902' , 'Ford' , 'Analyst' , '7566' , '1981-12-04' , '3000' , null , '20' );
insert into EMP values( '7934' , 'Miller' , 'Clerk' , '7782' , '1982-01-23' , '1300' , null , '10' );
