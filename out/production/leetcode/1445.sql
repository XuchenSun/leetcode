#1445 logic: use sume as the tool to calculte the value of diff
select sale_date,
sum(case when fruit='apples' then sold_num else -sold_num end) as diff
from Sales
group by sale_date;
