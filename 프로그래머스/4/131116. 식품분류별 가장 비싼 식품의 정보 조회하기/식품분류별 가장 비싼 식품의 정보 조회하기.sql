-- 식품분류별 가격이 가장 비싼 상품 조회, 분류가  '과자', '국', '김치', '식용유', 식품가격 기준으로 내림차순 정렬
SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
AND PRICE IN (SELECT MAX(PRICE)
             FROM FOOD_PRODUCT
             GROUP BY CATEGORY)
ORDER BY PRICE DESC;