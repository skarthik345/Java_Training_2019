select * from emp where JOB LIKE 'Analyst' or job like 'Salesman' 

select * from emp where hiredate < "1981-09-30"

select * from emp where mgr is not null

select ename,empno from emp where empno like 7369 or empno like 7521 or empno like 7839 or empno like 7934 or empno like 7788

select * from emp where deptno not in (30,40,10)

select * from emp where hiredate > "1981-06-30" and hiredate < "1981-12-31"

select distinct job from emp

select ename,comm from emp where comm is null

select * from emp where ename like "s%" or ename like "%s"

select * from emp where ename like "_i%"

select count(empno) from emp

select distinct job from emp

select sum(sal) from emp

select max(sal) as max_sal,min(sal) as min_sal,avg(sal) as avg_sal from emp

select max(sal) from emp where job like "Salesman"

-- ==============================================================================

SELECT job, avg(sal) from emp where deptno=20 group by job having 
avg(sal) > 1000 order by job;

