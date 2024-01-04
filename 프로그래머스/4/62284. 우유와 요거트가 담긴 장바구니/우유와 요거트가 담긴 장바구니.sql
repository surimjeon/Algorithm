-- 우유와 요거트 동시 구입한 장바구니(CART_ID) 있는지? / 아이디순으로 정렬
-- SELF JOIN??
WITH TEMP AS (
    SELECT DISTINCT CART_ID, NAME
    FROM CART_PRODUCTS
    WHERE NAME = "Milk"
    UNION ALL
    SELECT DISTINCT CART_ID, NAME
    FROM CART_PRODUCTS
    WHERE NAME = "Yogurt"
)
SELECT CART_ID
FROM TEMP
GROUP BY CART_ID
HAVING COUNT(*)>=2;