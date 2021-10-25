#logic 1 calculation the size of every product_id. 2 calculation the size of every product_id.  3 calculation total size 


# step 1
#select product_id,Width*Length*Height as size
#from Products;


#step2 

select Warehouse.name as warehouse_name,Warehouse.units*size_table.size as volume
from Warehouse
join 
(select product_id,Width*Length*Height as size
from Products) as size_table
on Warehouse.product_id=size_table.product_id;


*/

# step3

select step2.warehouse_name,sum(step2.volume) as volume
from
(select Warehouse.name as warehouse_name,Warehouse.units*size_table.size as volume
from Warehouse
join 
(select product_id,Width*Length*Height as size
from Products) as size_table
on Warehouse.product_id=size_table.product_id) as step2

group by step2.warehouse_name;







