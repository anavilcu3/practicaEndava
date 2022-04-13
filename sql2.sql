select * from countries;


/*INDIFERENT- ne gandim la outer join */
select *
from departments d right JOIN employees e
on d.department_id=e.department_id
UNION 
select *
from employees e right JOIN departments d
on d.department_id=e.department_id;

INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) VALUES
(207,'Gigi','Fane','gigi.fane@sqltutorial.org','515.123.8181','1994-06-08',1,8300.00,205,null);

SELECT COUNT(department_id) 
FROM employees;

SELECT COUNT(*) 
FROM employees;

SELECT d.department_name, MAX(salary)
FROM departments d right JOIN employees e
ON d.department_id=e.department_id
GROUP BY d.department_name;



SELECT * FROM(
select x.department_id, x.salary, y.mediu from
(select department_id, salary from employees outsideemployee
where salary > (select avg(salary)
from employees e left join departments d
on e.department_id=d.department_id
where outsideemployee.department_id = d.department_id
group by department_name) ) x
join (
(select avg(salary) mediu , e.department_id
from employees e left join departments d
on e.department_id=d.department_id
group by e.department_id)
) y
on x.department_id = y.department_id) z
JOIN departments z
ON z.department_id=d.department_id;

