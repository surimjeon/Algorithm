-- 5월 1일 기준으로 이전, 출고완료 / 이후, 출고미정
-- 주문id기준 오름차순
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,"%Y-%m-%d") AS OUT_DATE, IF(OUT_DATE<='2022-05-01',"출고완료", IF(OUT_DATE IS NULL, "출고미정", "출고대기")) AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID
