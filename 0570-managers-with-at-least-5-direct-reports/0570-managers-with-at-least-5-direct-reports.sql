# Write your MySQL query statement below
select e.name from Employee e where 5<=(
    select count(*) from Employee e1 where e.id=e1.managerId
)