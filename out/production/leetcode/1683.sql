#1683.sql
select tweet_id
from Tweets 
where length(content)>15;
