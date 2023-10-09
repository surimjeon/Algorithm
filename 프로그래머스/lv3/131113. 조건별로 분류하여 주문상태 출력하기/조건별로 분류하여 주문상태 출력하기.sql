-- 5월 1일을 기준으로 주문 ID, 제품ID,출고일자, 출고여부 조회
-- 5월 1일까지 출고완료, 이후로는 출고대기, 아님 출고 미정 
-- 주문 ID기준으로 오름차순 정렬
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,'%Y-%m-%d') AS OUT_DATE, IF(OUT_DATE<='2022-05-01', '출고완료', IF (OUT_DATE IS NULL, '출고미정','출고대기')) AS 출고여부
FROM FOOD_ORDER
