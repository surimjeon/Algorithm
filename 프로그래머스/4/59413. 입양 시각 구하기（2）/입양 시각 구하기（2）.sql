-- 각 시간대별로 입양이 몇 건이나 발생했는지, 시간대 순으로 정렬
WITH RECURSIVE CTE AS (
SELECT 0 AS NUM
UNION ALL 
SELECT NUM+1 FROM CTE WHERE NUM<23 
)

SELECT CTE.NUM AS HOUR, COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS RIGHT JOIN CTE ON HOUR(ANIMAL_OUTS.DATETIME)=CTE.NUM
GROUP BY HOUR
ORDER BY HOUR