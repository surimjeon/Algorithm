-- 공간 둘이상 등록 = 해비유저 , 아이디 순으로 조회
SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN (SELECT HOST_ID
            FROM PLACES
            GROUP BY HOST_ID
            HAVING COUNT(*)>=2)