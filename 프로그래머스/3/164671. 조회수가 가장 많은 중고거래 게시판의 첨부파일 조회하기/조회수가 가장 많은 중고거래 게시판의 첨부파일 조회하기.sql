-- 조회수가 가장 높은 중고거래 게시물 첨부파일 경로 (FILE ID DESC)
SELECT CONCAT('/home/grep/src/', BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
FROM USED_GOODS_FILE
WHERE BOARD_ID IN (SELECT BOARD_ID
                   FROM USED_GOODS_BOARD
                   WHERE VIEWS = (SELECT MAX(VIEWS)
                                  FROM USED_GOODS_BOARD))
ORDER BY FILE_ID DESC;