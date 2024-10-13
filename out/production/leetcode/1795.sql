#1795  1 use keyword "union" to get the result   2 use conditon where is not null
select product_id, 'store1' as store, store1 as price
from Products
where store1 is not null
union
select product_id, 'store2' as store,store2 as price
from Products
where store2 is not null
union
select product_id, 'store3' as store,store3 as price
from Products
where store3 is not null;
