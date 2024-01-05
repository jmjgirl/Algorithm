-- 서울에 위치한 식당들의 ~를 조회 (리뷰 평균 점수는 소수점 세번째에서 반올림, 평균점수 DESC, 즐겨찾기수 DESC)
SELECT I.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, ROUND(AVG(REVIEW_SCORE),2) AS SCORE
FROM REST_INFO I INNER JOIN REST_REVIEW R ON I.REST_ID = R.REST_ID
WHERE ADDRESS LIKE '서울%'
GROUP BY REST_ID
ORDER BY SCORE DESC, FAVORITES DESC;