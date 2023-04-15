-- 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회, FILE ID를 기준으로 내림차순 정렬
--  /home/grep/src/ 게시글 ID를 기준으로 디렉토리가 구분되고, 파일이름은 파일 ID, 파일 이름, 파일 확장자로 구성
SELECT CONCAT("/home/grep/src/",A.BOARD_ID,"/",B.FILE_ID,FILE_NAME,FILE_EXT) AS FILE_PATH
FROM USED_GOODS_BOARD AS A JOIN USED_GOODS_FILE AS B ON A.BOARD_ID = B.BOARD_ID
WHERE VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC;
