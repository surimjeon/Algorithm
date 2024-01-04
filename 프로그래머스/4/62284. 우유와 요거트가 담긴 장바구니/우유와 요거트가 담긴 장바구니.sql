-- 우유와 요거트 동시 구입한 장바구니(CART_ID) 있는지? / 아이디순으로 정렬
-- SELF JOIN??
SELECT DISTINCT CART_ID
FROM CART_PRODUCTS 
WHERE NAME = "Milk" 
AND CART_ID IN (SELECT CART_ID
               FROM CART_PRODUCTS
               WHERE NAME = "Yogurt")
ORDER BY CART_ID