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

-- ==============================================================================

select count(empno) as Count,avg(sal),deptno from emp where deptno like 20 group by deptno 

select ename,sal,(sal/10) as PF from emp

select * from emp where (DATEDIFF(current_date,hiredate)/365)>37

SELECT * from emp order by sal

select ename, hiredate from emp order by hiredate desc

select ename, sal,(sal/10) as PF,(sal/2) as HRA,(sal*(3/10)) as DA, (sal+sal/10+sal/2+sal*(3/10)) as gross
from emp order by gross

select d.deptno, count(e.empno) as count_of_emp
from dept d
left join emp e
on e.deptno=d.deptno
group by d.deptno

select d.deptno, sum(e.sal) as total_sal_payable
from dept d
left join emp e
on e.deptno=d.deptno
group by d.deptno

select job,count(empno) as count from emp group by job order by count desc

select job,max(sal),min(sal),avg(sal) from emp group by job

select max(sal),min(sal),avg(sal) from emp where deptno=20

-- ============================= select job,avg(sal) from emp where deptno=20 and avg(sal)>1000 group by job

