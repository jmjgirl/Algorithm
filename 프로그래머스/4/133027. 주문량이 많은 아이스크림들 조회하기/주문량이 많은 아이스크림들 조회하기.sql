-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3
SELECT J.FLAVOR 
FROM FIRST_HALF F RIGHT JOIN JULY J ON F.SHIPMENT_ID = J.SHIPMENT_ID
GROUP BY FLAVOR
ORDER BY SUM(F.TOTAL_ORDER) + SUM(J.TOTAL_ORDER) DESC
LIMIT 3;