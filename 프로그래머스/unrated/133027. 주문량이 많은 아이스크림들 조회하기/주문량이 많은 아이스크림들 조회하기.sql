--  같은 맛의 아이스크림이라도 다른 출하 번호를 갖게 됩니다.
-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문
SELECT A.FLAVOR
FROM FIRST_HALF AS A JOIN JULY AS B ON A.FLAVOR = B.FLAVOR
GROUP BY A.FLAVOR
ORDER BY SUM(A.TOTAL_ORDER)+SUM(B.TOTAL_ORDER) DESC
LIMIT 3