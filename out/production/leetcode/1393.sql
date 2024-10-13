# 1393
select stock_name,
sum(case when operation='Buy' then -price else price) as capital_gain_loss
from Stocks
group by stock_name;
