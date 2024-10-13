#1587

# 1 create a table which calculate balance
# 2select name and balance which bigger than 10000


# step1
/*1
(select Users.name,sum(Transactions.amount) as balance
from Transactions
join Users
on Transactions.account=Users.account
group by Transactions.account);

*/




# step2
select step1.name,step1.balance 
from
(select Users.name,sum(Transactions.amount) as balance
from Transactions
join Users
on Transactions.account=Users.account
group by Transactions.account) as step1 
where step1.balance>10000;
