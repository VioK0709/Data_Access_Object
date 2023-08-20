select product_name
from twotable.orders
         join onetable.customers on twotable.orders.customer_id = onetable.customers.id
where onetable.customers.name = :name;