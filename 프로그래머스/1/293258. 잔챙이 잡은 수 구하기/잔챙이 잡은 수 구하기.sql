# 잡은 물고기의 길이가 10cm 이하일 경우에는 LENGTH 가 NULL
SELECT COUNT(ID) AS FISH_COUNT
FROM FISH_INFO
WHERE LENGTH IS NULL;