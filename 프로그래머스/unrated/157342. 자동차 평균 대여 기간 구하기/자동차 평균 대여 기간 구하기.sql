-- 평균대여기간이 7일 이상인 자동차ID와 평균 대여기간 리스트 출력
-- 평균 대여 기간은 소수점 두번째 자리에서 반올림하고, 결과는 평균 대여 기간을 기준으로 내림차순 정렬해주시고, 평균 대여 기간이 같으면 자동차 ID를 기준으로 내림차순 정렬해주세요.
SELECT CAR_ID, ROUND(AVG(DateDiff(END_DATE,START_DATE)+1),1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
HAVING AVERAGE_DURATION>=7
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC