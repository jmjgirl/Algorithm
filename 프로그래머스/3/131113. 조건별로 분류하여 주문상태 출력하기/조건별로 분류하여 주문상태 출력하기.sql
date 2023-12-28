-- 5월 1일을 기준으로 주문 ID, 제품 ID, 출고일자, 출고여부 조회 (주문 ID기준 오름차순)
-- 출고여부는 5월 1일까지 출고완료 / 이후 날짜는 출고 대기 / 미정이면 출고미정
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE,'%Y-%m-%d'), CASE 
                                WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
                                WHEN OUT_DATE > '2022-05-01' THEN '출고대기'
                                ELSE '출고미정'
                                END AS 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;