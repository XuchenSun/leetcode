
#1303
# logic 
#1use command count create a new table 
#2 use join select information
select employee_id,team_size
from Employee


join

(select count(team_id) as team_size, team_id
from Employee
group by team_id) as team
on Employee.team_id=team.team_id;
